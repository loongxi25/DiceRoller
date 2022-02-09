package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    lateinit var btnRoll : Button
    var count: Int = 0
    lateinit var diceImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnRoll = findViewById(R.id.btnRoll)
        diceImage = findViewById(R.id.dice_image)
        val tvCount: TextView = findViewById(R.id.tvCount)

        btnRoll.setOnClickListener() {
            //Toast.makeText(applicationContext, "Clicked", Toast.LENGTH_LONG).show()
            generateRandomNo()

            count += 1

            tvCount.text = count.toString()
        }
    }

    /// int generateRandomNo()
    fun generateRandomNo() {
        //val tvNumber : TextView = findViewById(R.id.tvNumber)
        //val diceImage: ImageView = findViewById(R.id.dice_image)
        val number = (1..6).random()
        val drawableResource = when (number) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
        //tvNumber.text = number.toString()
    }
}