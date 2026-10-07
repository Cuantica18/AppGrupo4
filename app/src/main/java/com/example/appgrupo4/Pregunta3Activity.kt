package com.example.appgrupo4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.appgrupo4.databinding.ActivityPregunta3Binding

class Pregunta3Activity : AppCompatActivity() {

    private lateinit var binding: ActivityPregunta3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPregunta3Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}