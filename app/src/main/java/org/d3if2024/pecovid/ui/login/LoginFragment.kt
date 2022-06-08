package org.d3if2024.pecovid.ui.login

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.util.Patterns
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth
import org.d3if2024.pecovid.R
import org.d3if2024.pecovid.databinding.FragmentLoginBinding
import org.d3if2024.pecovid.helper.SharedPreference


class LoginFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var binding: FragmentLoginBinding
    private lateinit var auth: FirebaseAuth
    lateinit var sp:SharedPreference

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        auth = FirebaseAuth.getInstance()
        sp = SharedPreference(requireActivity())
        binding.nextBtn.setOnClickListener {
            login()
//            findNavController().navigate(R.id.action_loginActivity_to_homeFragment)

        }
        binding.textNewMember.setOnClickListener {
            findNavController().navigate(R.id.action_loginActivity_to_signUpFragment)
        }

        binding.textForgotPassword.setOnClickListener {
            findNavController().navigate(R.id.action_loginActivity_to_resetPassword)
        }
    }

    private fun login() {
        val email = binding.inputUsername.text.toString()
        val password = binding.inputPassword.text.toString()


        if (email.isEmpty() == true || null == true) {
            binding.inputUsername.error = "Email Harus Di Isi"
            binding.inputUsername.requestFocus()
        } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            binding.inputUsername.error = "Email Invalid"
            binding.inputUsername.requestFocus()
        } else if (password.isEmpty() == true || null == true) {
            binding.inputPassword.error = "Password Harus Di Isi"
            binding.inputPassword.requestFocus()
        } else if (password.length < 6) {
            binding.inputPassword.error = "Password Minimum 6 Character"
            binding.inputPassword.requestFocus()
        } else {
            loginApi(email, password)
        }
    }

    private fun loginApi(email: String, password: String) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(requireActivity()) { task ->
                if (task.isSuccessful) {
                    Toast.makeText(requireActivity(), "Selamat Datang $email ", Toast.LENGTH_SHORT)
                        .show()
                    findNavController().navigate(R.id.action_loginActivity_to_homeFragment)
                    sp.setStatusSignin(true)
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

