package org.d3if2024.pecovid.ui.home.variations

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import org.d3if2024.pecovid.R
import org.d3if2024.pecovid.databinding.FragmentVariantsPage1Binding

class VariantsFragmentPage_1 : Fragment() {
    private lateinit var binding: FragmentVariantsPage1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentVariantsPage1Binding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.alphaBtn.setOnClickListener {
            findNavController().navigate(R.id.action_variantsFragmentPage_1_to_variantsFragmentPage_2)
        }
    }
}