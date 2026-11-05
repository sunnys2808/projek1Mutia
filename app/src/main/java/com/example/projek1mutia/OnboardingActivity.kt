package com.example.projek1mutia

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class OnboardingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        val btnLanjut = findViewById<Button>(R.id.btnLanjut)

        btnLanjut.setOnClickListener {
            Toast.makeText(
                this,
                "Berhasil masuk halaman berikutnya!",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}