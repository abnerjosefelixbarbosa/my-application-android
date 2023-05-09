package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class DroidCafeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_droid_cafe)

        val iv_donuts: ImageView = findViewById(R.id.iv_donuts);
        val iv_ice_cream: ImageView = findViewById(R.id.iv_ice_cream);
        val iv_fro_yo: ImageView = findViewById(R.id.iv_fro_yo);

        val btnf_cart: ImageView = findViewById(R.id.btnf_cart);

        iv_donuts.setOnClickListener() {
            Toast.makeText(this, "donut", Toast.LENGTH_LONG).show();
        }

        iv_ice_cream.setOnClickListener() {
            Toast.makeText(this, "ice cream", Toast.LENGTH_LONG).show();
        }

        iv_fro_yo.setOnClickListener() {
            Toast.makeText(this, "fro yo", Toast.LENGTH_LONG).show();
        }

        btnf_cart.setOnClickListener() {
            Toast.makeText(this, "btnf_cart", Toast.LENGTH_LONG).show();
        }
    }
}