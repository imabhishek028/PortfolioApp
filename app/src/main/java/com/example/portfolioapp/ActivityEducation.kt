package com.example.portfolioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityEducation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_education)

        val button1=findViewById<Button>(R.id.BTEP)
        button1.setOnClickListener {
            intent = Intent(this,EduPrimary::class.java)
            startActivity(intent)
        }
        val button2=findViewById<Button>(R.id.BTES)
        button2.setOnClickListener {
            intent = Intent(this,EduSec::class.java)
            startActivity(intent)
        }
        val button3=findViewById<Button>(R.id.BTESS)
        button3.setOnClickListener {
            intent = Intent(this,EduSenSec::class.java)
            startActivity(intent)
        }
        val button4=findViewById<Button>(R.id.BTEUG)
        button4.setOnClickListener {
            intent = Intent(this,EduUG::class.java)
            startActivity(intent)
        }
        val button5=findViewById<Button>(R.id.BTEBK)
        button5.setOnClickListener {
            intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}