package com.example.classproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class loginactivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginactivity)

        val log = findViewById<Button>(R.id.btn_sign)as Button
        val go = findViewById<Button>(R.id.btn_log)as Button
        val tone = findViewById<EditText>(R.id.username)as EditText
        val ttwo = findViewById<EditText>(R.id.password)as EditText

        go.setOnClickListener{
            if (tone.text.toString()== "vintage" && ttwo.text.toString()== "123"){
                val intent = Intent(applicationContext, MainActivity::class.java)
                startActivity(intent)
            }
            else{

                var toast = Toast.makeText(applicationContext, "username or password incorrect", Toast.LENGTH_LONG)
                toast.show()
            }

        }


log.setOnClickListener{
    val intent = Intent(applicationContext, Signupactivity::class.java)
    startActivity(intent)
}

         }
    }

