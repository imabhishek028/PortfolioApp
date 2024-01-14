package com.example.portfolioapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.net.Uri
import android.view.View



class SkillsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skills)


        val buttonC=findViewById<Button>(R.id.BTCPL)
        buttonC.setOnClickListener{
            intent= Intent(this,SkillC::class.java)
            startActivity(intent)
        }
        val buttonCPP=findViewById<Button>(R.id.BTCPP)
        buttonCPP.setOnClickListener{
            intent= Intent(this,SkillCPP::class.java)
            startActivity(intent)
        }
        val buttonKT=findViewById<Button>(R.id.BTKT)
        buttonKT.setOnClickListener{
            intent= Intent(this,SkillKotlin::class.java)
            startActivity(intent)
        }
        val buttonAS=findViewById<Button>(R.id.BTAS)
        buttonAS.setOnClickListener{
            intent= Intent(this,SkillAS::class.java)
            startActivity(intent)
        }
        val buttonBK1=findViewById<Button>(R.id.BTBK)
        buttonBK1.setOnClickListener {
            intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        }
    }