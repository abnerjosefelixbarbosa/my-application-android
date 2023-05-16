package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class SecontActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secont);

        val imageId = intent.getIntExtra("KEY_IMAGEM", R.drawable.donut_circle);
        val imageName = intent.getStringExtra("KEY_IMAGEM_NAME").orEmpty();

        val ivImage: ImageView = findViewById(R.id.iv_image_response);
        val tvImageName: TextView = findViewById(R.id.tv_texte_image_response);

        ivImage.setImageResource(imageId);
        tvImageName.text = imageName;
    }
}