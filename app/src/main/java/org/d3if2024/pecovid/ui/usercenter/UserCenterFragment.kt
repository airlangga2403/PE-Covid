package org.d3if2024.pecovid.ui.usercenter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import org.d3if2024.pecovid.R
import org.d3if2024.pecovid.databinding.FragmentUserCenterBinding

class UserCenterFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var binding: FragmentUserCenterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentUserCenterBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.bottomNavigationView.setOnItemReselectedListener {
            when (it.itemId) {
                R.id.bottom_navbar_settings -> {
                    findNavController().navigate(R.id.action_userCenterFragment_to_settingsFragment)
                }
                R.id.bottom_navbar_home -> {
                    findNavController().navigate(R.id.action_userCenterFragment_to_homeFragment)
                }
            }
        }
    }
}