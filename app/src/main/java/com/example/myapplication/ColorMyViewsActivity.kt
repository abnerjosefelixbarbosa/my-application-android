package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class ColorMyViewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color_my_views)

        val tvBoxOne: TextView = findViewById(R.id.tv_boxone);
        val tvBoxTwo: TextView = findViewById(R.id.tv_boxtwo);
        val tvBoxThree: TextView = findViewById(R.id.tv_boxthree);
        val btnRed: Button = findViewById(R.id.btn_red);
        val btnYellow: Button = findViewById(R.id.btn_yellow);
        val btnGreen: Button = findViewById(R.id.btn_green);

        btnRed.setOnClickListener() {
            Toast.makeText(this, "Red", Toast.LENGTH_LONG).show();
        }

        btnYellow.setOnClickListener() {
            Toast.makeText(this, "Yellow", Toast.LENGTH_LONG).show();
        }

        btnGreen.setOnClickListener() {
            Toast.makeText(this, "Green", Toast.LENGTH_LONG).show();
        }
    }
}