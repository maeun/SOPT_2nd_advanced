package com.maeun.sopt_2nd_advanced

import android.support.v4.app.FragmentManager
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentStatePagerAdapter

class pageradapter (fm:FragmentManager) : FragmentStatePagerAdapter(fm) {
    override fun getItem(position: Int): Fragment? {
        when (position) {
            0 -> return Fragment1()
            else -> return Fragment2()
        }
    }

    override fun getCount(): Int {
        return 2
    }
}