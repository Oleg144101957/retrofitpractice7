package com.vishnevskiypro.retrofitpractice7

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.vishnevskiypro.retrofitpractice7.screens.first.FirstFragment
import com.vishnevskiypro.retrofitpractice7.screens.second.SecondFragment

class ViewPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount() = 2

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> {
                FirstFragment()
            }
            else -> {
                SecondFragment()
            }
        }
    }
}