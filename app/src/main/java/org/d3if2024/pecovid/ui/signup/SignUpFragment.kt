package org.d3if2024.pecovid.ui.signup

import android.os.Bundle
import android.util.Patterns
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth
import org.d3if2024.pecovid.R
import org.d3if2024.pecovid.databinding.FragmentSignUpBinding


class SignUpFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var binding: FragmentSignUpBinding
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSignUpBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        auth = FirebaseAuth.getInstance()
        binding.textNewMember.setOnClickListener {
            findNavController().navigate(R.id.action_signUpFragment_to_loginActivity)
        }
        binding.nextBtn.setOnClickListener {
            signUpUser()
        }
    }

    private fun signUpUser() {
        val email = binding.inputUsername.text.toString()
        val password = binding.inputPassword.text.toString()

        if (email.isEmpty()) {
            binding.inputUsername.error = "Email Harus Di Isi"
            binding.inputUsername.requestFocus()
        } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            binding.inputUsername.error = "Email Invalid"
            binding.inputUsername.requestFocus()
        } else if (password.isEmpty()) {
            binding.inputPassword.error = "Password Harus Di Isi"
            binding.inputPassword.requestFocus()
        } else if (password.length < 6) {
            binding.inputPassword.error = "Password Minimum 6 Character"
            binding.inputPassword.requestFocus()
        } else {
            signUpApi(email, password)
        }
    }

    private fun signUpApi(email: String, password: String) {
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(requireActivity()) { task ->
                if (task.isSuccessful) {
                    Toast.makeText(
                        requireActivity(),
                        "Registrasi Berhasil $email",
                        Toast.LENGTH_SHORT
                    ).show()
                    findNavController().navigate(R.id.action_signUpFragment_to_loginActivity)
                } else {
                    Toast.makeText(
                        requireActivity(),
                        "${task.exception?.message}",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
    }
}