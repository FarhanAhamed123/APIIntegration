package com.example.apiintegration

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val getButton: Button = findViewById(R.id.btn1)
        getButton.setOnClickListener {
            val intent = Intent(baseContext, MainActivity2::class.java)
            startActivity(intent)
        }

        val postButton: Button = findViewById(R.id.btn2)
        postButton.setOnClickListener {
            val intent2 = Intent(baseContext, MainActivity3::class.java)
            startActivity(intent2)
        }

        val putButton: Button = findViewById(R.id.btn3)
        putButton.setOnClickListener {
            val intent3 = Intent(baseContext, MainActivity4::class.java)
            startActivity(intent3)
        }

        val deleteButton: Button = findViewById(R.id.btn4)
        deleteButton.setOnClickListener {
            val intent4 = Intent(baseContext, MainActivity5::class.java)
            startActivity(intent4)
        }
    }
}