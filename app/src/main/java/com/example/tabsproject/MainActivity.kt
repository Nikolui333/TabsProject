package com.example.tabsproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.tabsproject.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding?.slider?.adapter = MyAdapter(this)

        val tabLayoutMediator = binding?.tabSlider?.let {
            binding?.slider?.let { it1 ->
                TabLayoutMediator(it,
                    it1,
                    TabLayoutMediator.TabConfigurationStrategy { tab, position ->

                        when (position) {
                            0 -> {
                                tab.setIcon(R.drawable.play)
                                tab.text = getString(R.string.StrengthOfWill)
                            }
                            1 -> {
                                tab.setIcon(R.drawable.play)
                                tab.text = getString(R.string.SpeedReading)
                            }
                            2 -> {
                                tab.setIcon(R.drawable.play)
                                tab.text = getString(R.string.JediTechniques)
                            }
                            3 -> {
                                tab.setIcon(R.drawable.play)
                                tab.text = getString(R.string.InstructionForTheBrain)
                            }
                        }

                    })
            }
        }
        tabLayoutMediator?.attach()

    }
}