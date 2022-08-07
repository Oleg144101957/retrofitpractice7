package com.vishnevskiypro.retrofitpractice7.screens.root

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import com.google.android.material.tabs.TabLayoutMediator
import com.vishnevskiypro.retrofitpractice7.R
import com.vishnevskiypro.retrofitpractice7.ViewPagerAdapter
import com.vishnevskiypro.retrofitpractice7.databinding.FragmentRootBinding


class RootFragment : Fragment() {

    private lateinit var binding: FragmentRootBinding
    private lateinit var ctx: Context

    override fun onAttach(context: Context) {
        ctx = context
        super.onAttach(context)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentRootBinding.inflate(layoutInflater, container, false)
        binding.tabLayout.tabIconTint = null
        binding.viewPager.adapter = ViewPagerAdapter(ctx as FragmentActivity)

        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, pos ->
            when (pos) {
                0 -> {
                    tab.setIcon(R.drawable.ic_baseline_attach_money_24)
                }

                else -> {
                    tab.setIcon(R.drawable.ic_baseline_money_24)
                }
            }
        }.attach()

        return binding.root
    }

}