package org.d3if2024.pecovid.helper

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import org.d3if2024.pecovid.R


class CheckerFragment : Fragment() {
    private var statusSignin = false
    private lateinit var sp: SharedPreference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        sp = SharedPreference(requireActivity())
        if (sp.getStatusSignin() == true) {
            findNavController().navigate(R.id.action_checkerFragment_to_homeFragment)
        } else {
            findNavController().navigate(R.id.action_checkerFragment_to_landingPage_1)
        }
        return inflater.inflate(R.layout.fragment_checker, container, false)
    }

}