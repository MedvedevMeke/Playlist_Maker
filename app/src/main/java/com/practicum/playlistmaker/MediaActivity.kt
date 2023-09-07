package com.practicum.playlistmaker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MediaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_media)

        val backMediaButton = findViewById<Button>(R.id.back_media_button)
        backMediaButton.setOnClickListener {
            val backMediaIntent = Intent(this, MainActivity::class.java)
            startActivity(backMediaIntent)
        }
    }

}