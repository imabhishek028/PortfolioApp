package com.example.portfolioapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import android.widget.ImageView
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.portfolioapp.ui.theme.PortfolioAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView: ImageView= findViewById(R.id.ProfilePicture)
        imageView.setImageResource(R.drawable.selfatorion)

        val buttonSkills=findViewById<Button>(R.id.BTSkills)
        buttonSkills.setOnClickListener{
            intent= Intent(this,SkillsActivity::class.java)
            startActivity(intent)
        }
        val buttonEducation=findViewById<Button>(R.id.BTEducation)
        buttonEducation.setOnClickListener{
            intent= Intent(this,ActivityEducation::class.java)
            startActivity(intent)
        }

    }
}
