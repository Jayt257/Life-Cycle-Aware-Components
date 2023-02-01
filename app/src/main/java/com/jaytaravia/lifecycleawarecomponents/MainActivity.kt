package com.jaytaravia.lifecycleawarecomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycle.addObserver(Observer())
        Log.d("MAIN", "Activity OnCreate")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MAIN", "Activity OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MAIN", "Activity OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MAIN", "Activity OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MAIN", "Activity OnDestroy")
    }
}