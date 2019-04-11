package com.example.kotlinfragment

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

const val Kotlin = "kotlinTest"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ViewPagerAdapter(supportFragmentManager)
        viewPager.adapter = adapter

        txv1.setOnClickListener {
            Toast.makeText(this, "text edit press", Toast.LENGTH_LONG).show()
        }

        btn1.setOnClickListener {
            Toast.makeText(this, "button press", Toast.LENGTH_LONG).show()
        }
    }
}

class ViewPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {
    override fun getItem(p0: Int): Fragment = when(p0) {
        0 -> FirstFragment()
        1 -> SecondFragment()
        else -> ThirdFragment()
    }

    override fun getCount(): Int = 3
}
