package com.example.portfolioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SkillAS : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill_as)


        val button1=findViewById<Button>(R.id.BTAS1)
        button1.setOnClickListener {
            intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        val button2=findViewById<Button>(R.id.BTAS2)
        button2.setOnClickListener {
            intent= Intent(this,SkillsActivity::class.java)
            startActivity(intent)
        }
    }
}