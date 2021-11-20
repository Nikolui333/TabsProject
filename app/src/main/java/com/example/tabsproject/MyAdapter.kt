package com.example.tabsproject

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class MyAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                StrengthOfWill()
            }
            1 -> {
                SpeedReading()
            }
            2 -> {
                JediTechniques()
            }
            3 -> {
                InstructionForTheBrain()
            }
            else -> {
                StrengthOfWill()
            }
        }
    }
}