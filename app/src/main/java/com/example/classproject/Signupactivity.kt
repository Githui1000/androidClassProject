package com.example.classproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Signupactivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signupactivity)

        val b =findViewById<Button>(R.id.back)

     b.setOnClickListener {
         val intent = Intent(applicationContext, loginactivity::class.java)

         startActivity(intent)
     }
    }
}
