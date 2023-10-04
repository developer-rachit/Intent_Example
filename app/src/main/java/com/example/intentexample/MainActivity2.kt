package com.example.intentexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {

    private lateinit var btn2: Button
    private lateinit var edit2: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btn2 = findViewById(R.id.button2)
        edit2 = findViewById(R.id.edit2)


        val intent = intent
        val string: String? = intent.getStringExtra("name")

        if(string != null) {
            edit2.setText(string)
        }

        btn2.setOnClickListener() {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}