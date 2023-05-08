package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv_numero: TextView = findViewById(R.id.tv_numero);
        val btn_toast: Button = findViewById(R.id.btn_toast);
        val btn_count: Button = findViewById(R.id.btn_count);

        btn_toast.setOnClickListener() {
            Toast.makeText(this, "Hello Toast", Toast.LENGTH_LONG).show();
        }

        btn_count.setOnClickListener() {
            var valorTvNumero: Int = tv_numero.text.toString().toInt();
            valorTvNumero += 1;
            tv_numero.text = valorTvNumero.toString();
        }
    }
}