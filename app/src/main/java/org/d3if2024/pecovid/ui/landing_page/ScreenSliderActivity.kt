package org.d3if2024.pecovid.ui.landing_page

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import org.d3if2024.pecovid.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
private const val NUM_PAGES = 3

/**
 * A simple [Fragment] subclass.
 * Use the [ScreenSliderActivity.newInstance] factory method to
 * create an instance of this fragment.
 */
class ScreenSliderActivity : FragmentActivity() {
    // TODO: Rename and change types of parameters
    private lateinit var viewPager : ViewPager2


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_screen_slider_activity)

//        viewPager = findViewById(R.id.pager)
//
//        val pagerAdapter = ScreenSliderPagerAdapter(this)
//        viewPager.adapter = pagerAdapter
    }


    override fun onBackPressed() {
        if(viewPager.currentItem == 0){
            super.onBackPressed()
        }else{
            viewPager.currentItem = viewPager.currentItem - 1
        }
    }

    private inner class ScreenSliderPagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa){
        override fun getItemCount(): Int = NUM_PAGES

        override fun createFragment(position: Int): Fragment = LandingPage_2()
    }

    }
