package com.example.receipedetail_constraint.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.example.receipedetail_constraint.R
import com.example.receipedetail_constraint.fragments.InfoFragment
import com.example.receipedetail_constraint.fragments.MaterialFragment
import com.example.receipedetail_constraint.fragments.VideoFragment

class PagerAdapterDetails(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> InfoFragment.newFragment()
            1 -> MaterialFragment.newFragment()
            else -> VideoFragment.newFragment()
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "Info"
            1 -> "Material N Doing"
            else -> "Videos"
        }
    }

}