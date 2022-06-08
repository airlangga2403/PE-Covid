package org.d3if2024.pecovid.ui.home

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.annotation.NonNull
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import org.d3if2024.pecovid.R
import org.d3if2024.pecovid.databinding.FragmentHomeBinding
import org.d3if2024.pecovid.ui.home.moreinfo.MoreinfoActivity
import org.d3if2024.pecovid.ui.home.preventions.PreventionsActivity
import org.d3if2024.pecovid.ui.home.recovery.RecoveryActivity
import org.d3if2024.pecovid.ui.home.variations.VariationsActivity


class HomeFragment : Fragment() {

    companion object {
        fun newInstance() = HomeFragment()
    }

    private lateinit var binding: FragmentHomeBinding
    private lateinit var listIntent: Intent

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.variationsBtn.setOnClickListener {
            listIntent = Intent(requireActivity(), VariationsActivity::class.java)
            startActivity(listIntent)
        }
        binding.preventionBtn.setOnClickListener {
            listIntent = Intent(requireActivity(), PreventionsActivity::class.java)
            startActivity(listIntent)
        }
        binding.recoveryBtn.setOnClickListener {
            listIntent = Intent(requireActivity(), RecoveryActivity::class.java)
            startActivity(listIntent)
        }
        binding.moreinfoBtn.setOnClickListener {
            listIntent = Intent(requireActivity(), MoreinfoActivity::class.java)
            startActivity(listIntent)
        }
        binding.bottomNavigationView.setOnItemReselectedListener {
            when (it.itemId) {
                R.id.bottom_navbar_settings -> {
                    findNavController().navigate(R.id.action_homeFragment_to_settingsFragment)
                }
                R.id.bottom_navbar_usercenter -> {
                    findNavController().navigate(R.id.action_homeFragment_to_userCenterFragment)
                }
            }
        }
    }


}