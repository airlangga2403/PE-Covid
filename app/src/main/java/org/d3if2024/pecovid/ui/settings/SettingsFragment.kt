package org.d3if2024.pecovid.ui.settings

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import org.d3if2024.pecovid.R
import org.d3if2024.pecovid.databinding.FragmentSettingsBinding
import org.d3if2024.pecovid.helper.SharedPreference


class SettingsFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var binding: FragmentSettingsBinding
    lateinit var sp: SharedPreference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSettingsBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sp = SharedPreference(requireActivity())
        binding.switchDarkMode.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }
        binding.buttonLogout.setOnClickListener {
            Firebase.auth.signOut()
            sp.setStatusSignin(false)
            findNavController().navigate(R.id.action_settingsFragment_to_loginActivity)
            Toast.makeText(requireActivity(), "Akun Berhasil Log Out", Toast.LENGTH_SHORT)
                .show()
        }
        binding.bottomNavigationView.setOnItemReselectedListener {
            when (it.itemId) {
                R.id.bottom_navbar_home -> {
                    findNavController().navigate(R.id.action_settingsFragment_to_homeFragment)
                }
                R.id.bottom_navbar_usercenter -> {
                    findNavController().navigate(R.id.action_settingsFragment_to_userCenterFragment)
                }
            }
        }
    }
}