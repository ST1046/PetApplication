package com.rose.mypetapplication

//ST10460872
//Deborah Habtom Tesfayohannes
//YouTube Link: https://youtu.be/Ym4bHN-im-w

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

private lateinit var dogBtn: Button
private lateinit var catBtn:Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        catBtn = findViewById(R.id.catBtn)

        catBtn.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }

        dogBtn = findViewById(R.id.dogBtn)

        dogBtn.setOnClickListener {
            val intent = Intent(this,MainActivity4::class.java)
            startActivity(intent)
        }

    }
}