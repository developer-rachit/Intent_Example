package com.example.intentexample

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {

    private lateinit var btn1: Button
    private lateinit var edit1: EditText

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1 = findViewById(R.id.button)
        edit1 = findViewById(R.id.edit1)


        btn1.setOnClickListener() {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("name", edit1.text.toString())
            startActivity(intent)
        }
    }
}