package com.example.tabwithfragment.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.tabwithfragment.fragment.BackendFragment
import com.example.tabwithfragment.fragment.FrontFragment
import com.example.tabwithfragment.fragment.MobileFragment

class ViewPagerAdapter(
    fragmentManager: FragmentManager
) : FragmentPagerAdapter(fragmentManager) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> MobileFragment()
            1 -> FrontFragment()
            2 -> BackendFragment()
            else -> Fragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "Mobile"
            1 -> "Front-End"
            2 -> "Backend"
            else -> ""
        }
    }
}