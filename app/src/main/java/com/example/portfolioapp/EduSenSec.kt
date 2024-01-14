package com.example.portfolioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EduSenSec : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edu_sen_sec)

        val button1=findViewById<Button>(R.id.BTESS1)
        button1.setOnClickListener {
            intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        val button2=findViewById<Button>(R.id.BTESS2)
        button2.setOnClickListener {
            intent= Intent(this,ActivityEducation::class.java)
            startActivity(intent)
        }
    }
}