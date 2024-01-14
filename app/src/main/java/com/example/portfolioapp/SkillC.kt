package com.example.portfolioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SkillC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill_c)


        val button1=findViewById<Button>(R.id.BTC1)
        button1.setOnClickListener {
            intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        val button2=findViewById<Button>(R.id.BTC2)
        button2.setOnClickListener {
            intent= Intent(this,SkillsActivity::class.java)
            startActivity(intent)
        }
    }
}