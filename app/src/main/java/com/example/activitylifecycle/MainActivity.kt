package com.example.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toast = Toast.makeText(applicationContext,"OnCreate called",Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()

        val toast = Toast.makeText(applicationContext,"onStart called",Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        // It will show a message on the screen
        // then onRestart is invoked
        val toast = Toast.makeText(applicationContext, "onRestart Called", Toast.LENGTH_LONG).show()

    }

    override fun onResume() {
        super.onResume()
       val toast = Toast.makeText(applicationContext,"onResume is called",Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        // It will show a message on the screen
        // then onPause is invoked
        val toast = Toast.makeText(applicationContext, "onPause Called", Toast.LENGTH_LONG).show()
    }
    override fun onStop() {
        super.onStop()
        // It will show a message on the screen
        // then onStop is invoked
        val toast = Toast.makeText(applicationContext, "onStop Called", Toast.LENGTH_LONG).show()
    }
    override fun onDestroy() {
        super.onDestroy()
        // It will show a message on the screen
        // then onDestroy is invoked
        val toast = Toast.makeText(applicationContext, "onDestroy Called", Toast.LENGTH_LONG).show()
    }


}