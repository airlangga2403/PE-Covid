package org.d3if2024.pecovid.ui.landing_page

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import org.d3if2024.pecovid.R
import org.d3if2024.pecovid.databinding.FragmentLandingPage3Binding

class LandingPage_3 : Fragment() {
    private lateinit var binding: FragmentLandingPage3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLandingPage3Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextBtn.setOnClickListener{
            findNavController().navigate(R.id.action_landingPage_3_to_loginActivity)
//            findNavController().navigate(R)
        }
    }
}