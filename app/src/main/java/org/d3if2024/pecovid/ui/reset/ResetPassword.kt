package org.d3if2024.pecovid.ui.reset

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
import org.d3if2024.pecovid.databinding.FragmentResetPasswordBinding

class ResetPassword : Fragment() {

    private lateinit var binding: FragmentResetPasswordBinding
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentResetPasswordBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        auth = FirebaseAuth.getInstance()
        binding.textNewMember.setOnClickListener {
            findNavController().navigate(R.id.action_resetPassword_to_loginActivity)
        }
        binding.nextBtn.setOnClickListener {
            sendResetPassword()
        }
    }

    private fun sendResetPassword() {
        val email = binding.inputUsername.text.toString()

        if (email.isEmpty()) {
            binding.inputUsername.error = "Email Harus Di Isi"
            binding.inputUsername.requestFocus()
        }

        else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            binding.inputUsername.error = "Email Invalid"
            binding.inputUsername.requestFocus()
        } else {
            reset(email)
        }

    }

    private fun reset(email: String) {
        auth.sendPasswordResetEmail(email)
            .addOnCompleteListener(requireActivity()) { task ->
                if (task.isSuccessful) {
                    Toast.makeText(
                        requireActivity(),
                        "Reset Link Dikirim Ke $email",
                        Toast.LENGTH_SHORT
                    ).show()
                    findNavController().navigate(R.id.action_resetPassword_to_loginActivity)
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