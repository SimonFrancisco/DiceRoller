package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    // creating diceImage here in order not to be calling it again and again in rollDice()
    //makes the app work faster
    lateinit var diceImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //calling button
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = "Let's Roll"
        //Making it do something when clicked on
        rollButton.setOnClickListener {
            rollDice()
        }
        //calling ImageView
        diceImage = findViewById(R.id.dice_image)
    }

    private fun rollDice() {
        //Changing the image of the dice randomly
        val drawableResource = when (Random.nextInt(6) + 1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        //Setting diceImage to change to different images
        diceImage.setImageResource(drawableResource)
    }
}