package org.d3if2024.pecovid.ui.landing_page

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import org.d3if2024.pecovid.R
import org.d3if2024.pecovid.databinding.FragmentHomeBinding
import org.d3if2024.pecovid.databinding.FragmentLandingPage1Binding

class LandingPage_1 : Fragment() {
    private lateinit var binding: FragmentLandingPage1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLandingPage1Binding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button2.setOnClickListener { findNavController().navigate(R.id.action_landingPage_1_to_landingPage_2) }
    }
}