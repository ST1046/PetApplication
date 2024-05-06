package com.rose.mypetapplication

//ST10460872
//Deborah Habtom Tesfayohannes
//YouTube Link: https://youtu.be/Ym4bHN-im-w

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar

class MainActivity4 : AppCompatActivity() {

    private lateinit var backButton: Button
    private lateinit var feedButton: Button
    private lateinit var cleanButton: Button
    private lateinit var playButton: Button
    private lateinit var dogChill: ImageView
    private lateinit var feedBar: ProgressBar
    private lateinit var cleanBar: ProgressBar
    private lateinit var playBar: ProgressBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        backButton = findViewById(R.id.backButton)
        feedButton = findViewById(R.id.feedButton)
        cleanButton = findViewById(R.id.cleanButton)
        playButton = findViewById(R.id.playButton)
        dogChill=  findViewById(R.id.dogChill)
        feedBar = findViewById(R.id.feedBar)
        cleanBar = findViewById(R.id.cleanBar)
        playBar = findViewById(R.id.playBar)


        //set back button to work

        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }

        //set each button to increase the bars by 25

        feedButton.setOnClickListener {
            feedBar.incrementProgressBy(25)
            updateFeedImage(feedBar.progress)
        }

        cleanButton.setOnClickListener {
            cleanBar.incrementProgressBy(25)
            updateCleanImage(cleanBar.progress)
        }

        playButton.setOnClickListener {
            playBar.incrementProgressBy(25)
            updatePlayImage(playBar.progress)
        }


    }

    //using a private fun, update each individual number to an image
    //copy and paste it twice after and change the names to match the "update" under each button
    //set numbers to which chillImage will change
    //make sure to use 'Int' and not 'String'

    private fun updateCleanImage(progress: Int){
        when{
            progress == 0 -> dogChill.setImageResource(R.drawable.dogdirty_25)
            progress == 25 -> dogChill.setImageResource(R.drawable.dogdirty_25)
            progress == 50 -> dogChill.setImageResource(R.drawable.dogdirty_50)
            progress == 75 -> dogChill.setImageResource(R.drawable.dogdirty_75)
            progress == 100 -> dogChill.setImageResource(R.drawable.dogdirty_100)
        }

    }

    private fun updateFeedImage(progress: Int){
        when{
            progress == 0  -> dogChill.setImageResource(R.drawable.dogate_25)
            progress == 25 -> dogChill.setImageResource(R.drawable.dogate_25)
            progress == 50 -> dogChill.setImageResource(R.drawable.dogate_50)
            progress == 75 -> dogChill.setImageResource(R.drawable.dogate_75)
            progress == 100 -> dogChill.setImageResource(R.drawable.dogate_100)
        }

    }

    private fun updatePlayImage(progress: Int){
        when{
            progress == 0 -> dogChill.setImageResource(R.drawable.dogplay_25)
            progress == 25 -> dogChill.setImageResource(R.drawable.dogplay_25)
            progress == 50 -> dogChill.setImageResource(R.drawable.dogplay_50)
            progress == 75 -> dogChill.setImageResource(R.drawable.dogplay_75)
            progress == 100 -> dogChill.setImageResource(R.drawable.dogplay_100)
        }
    }
}