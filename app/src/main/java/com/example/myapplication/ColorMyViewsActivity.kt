package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat

class ColorMyViewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color_my_views)

        val tvBoxThree: TextView = findViewById(R.id.tv_boxthree);
        val tvBoxFour: TextView = findViewById(R.id.tv_boxfour);
        val tvBoxFive: TextView = findViewById(R.id.tv_boxfive);

        val btnRed: Button = findViewById(R.id.btn_red);
        val btnYellow: Button = findViewById(R.id.btn_yellow);
        val btnGreen: Button = findViewById(R.id.btn_green);

        var tvBoxThreeValid: Boolean = false;
        var tvBoxFourValid: Boolean = false;
        var tvBoxFiveValid: Boolean = false;

        tvBoxThree.setOnClickListener() {
            tvBoxThreeValid = true;
        }

        tvBoxFour.setOnClickListener() {
            tvBoxFourValid = true;
        }

        tvBoxFive.setOnClickListener() {
            tvBoxFiveValid = true;
        }

        btnRed.setOnClickListener() {
            val colorRed: Int = ContextCompat.getColor(this, R.color.red);

            if (tvBoxThreeValid === true) {
                tvBoxThree.setBackgroundColor(colorRed)
            }
            if (tvBoxFourValid === true) {
                tvBoxFour.setBackgroundColor(colorRed)
            }
            if (tvBoxFiveValid === true) {
                tvBoxFive.setBackgroundColor(colorRed)
            }

            tvBoxThreeValid = false;
            tvBoxFourValid = false;
            tvBoxFiveValid = false;
        }

        btnYellow.setOnClickListener() {
            val colorYellow: Int = ContextCompat.getColor(this, R.color.yellow);

            if (tvBoxThreeValid === true) {
                tvBoxThree.setBackgroundColor(colorYellow)
            }
            if (tvBoxFourValid === true) {
                tvBoxFour.setBackgroundColor(colorYellow)
            }
            if (tvBoxFiveValid === true) {
                tvBoxFive.setBackgroundColor(colorYellow)
            }

            tvBoxThreeValid = false;
            tvBoxFourValid = false;
            tvBoxFiveValid = false;
        }

        btnGreen.setOnClickListener() {
            val colorGreen: Int = ContextCompat.getColor(this, R.color.green);

            if (tvBoxThreeValid === true) {
                tvBoxThree.setBackgroundColor(colorGreen)
            }
            if (tvBoxFourValid === true) {
                tvBoxFour.setBackgroundColor(colorGreen)
            }
            if (tvBoxFiveValid === true) {
                tvBoxFive.setBackgroundColor(colorGreen)
            }

            tvBoxThreeValid = false;
            tvBoxFourValid = false;
            tvBoxFiveValid = false;
        }
    }
}