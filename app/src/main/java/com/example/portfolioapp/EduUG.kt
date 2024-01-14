package com.example.portfolioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EduUG : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edu_ug)


        val button1=findViewById<Button>(R.id.BTEUG1)
        button1.setOnClickListener {
            intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        val button2=findViewById<Button>(R.id.BTEUG2)
        button2.setOnClickListener {
            intent= Intent(this,ActivityEducation::class.java)
            startActivity(intent)
        }
    }
}