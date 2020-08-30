package com.firasalshawa.bottomappbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.firasalshawa.bottomappbar.fragments.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_main)
        super.onCreate(savedInstanceState)

        loadFragment(Home_Fragment())

        bottomNavigation.setOnNavigationItemSelectedListener {
            when{
                it.itemId == R.id.mainpage ->{
                    loadFragment(Home_Fragment())
                    return@setOnNavigationItemSelectedListener true
                }

                it.itemId == R.id.dashboard->{
                    loadFragment(Dashboard_Fragment())
                    return@setOnNavigationItemSelectedListener true
                }

                it.itemId == R.id.map->{
                    loadFragment(Map_Fragment())
                    return@setOnNavigationItemSelectedListener true
                }

                it.itemId == R.id.Tune->{
                    loadFragment(Tune_Fragment())
                    return@setOnNavigationItemSelectedListener true
                }

                it.itemId == R.id.weekend->{
                    loadFragment(Weekend_Fragment())
                    return@setOnNavigationItemSelectedListener true
                }

                else->{
                    return@setOnNavigationItemSelectedListener false
                }
            }
        }

    }

    private fun loadFragment(fragment:Fragment){
        supportFragmentManager.beginTransaction().also { fragmentTransaction ->
            fragmentTransaction.replace(R.id.fragmentContainer,fragment)
            fragmentTransaction.commit()
        }
    }


}