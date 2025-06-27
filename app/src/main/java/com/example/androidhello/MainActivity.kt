package com.example.androidhello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.hello_button)
        button.setOnClickListener {
            Toast.makeText(this, "Hello Android", Toast.LENGTH_SHORT).show()
        }
    }
}
