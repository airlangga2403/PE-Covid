package org.d3if2024.pecovid.ui.home.variations

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.d3if2024.pecovid.R
import org.d3if2024.pecovid.databinding.FragmentVariantsPage2Binding

class VariantsFragmentPage_2 : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var binding: FragmentVariantsPage2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentVariantsPage2Binding.inflate(layoutInflater, container, false)
        return binding.root
    }
}