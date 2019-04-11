package com.example.kotlinfragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FirstFragment: Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(Kotlin, "first fragment onCreate")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //return super.onCreateView(inflater, container, savedInstanceState)

        val view = inflater.inflate(R.layout.first_fragment, container, false)
        Log.d(Kotlin, "first fragment onCreateView")
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(Kotlin, "first fragment onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d(Kotlin, "first fragment onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(Kotlin, "first fragment onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(Kotlin, "first fragment onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(Kotlin, "first fragment onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(Kotlin, "first fragment onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(Kotlin, "first fragment onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(Kotlin, "first fragment onDetach")
    }
}