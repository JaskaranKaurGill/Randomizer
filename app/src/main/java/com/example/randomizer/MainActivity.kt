package com.example.randomizer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.RollButton)
        val resultTextView = findViewById<TextView>(R.id.resultsTextView)
        val seekBar1 = findViewById<SeekBar>(R.id.seekBar)
        val setNumber1 = findViewById<TextView>(R.id.SetNumber)

        rollButton.setOnClickListener {
            val rand = Random.nextInt(seekBar1.progress)
            resultTextView.text = rand.toString()

        }


    }
}


