package com.example.appgrupo4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.appgrupo4.databinding.ActivityHomeBinding
import android.content.Intent

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigation.setOnItemSelectedListener { item ->

            when (item.itemId) {

                R.id.nav_pregunta1 -> {
                    startActivity(Intent(this, Pregunta1Activity::class.java))
                    true
                }

                R.id.nav_pregunta2 -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, Pregunta2Fragment())
                        .commit()
                    true
                }

                R.id.nav_pregunta4 -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, Pregunta4Fragment())
                        .commit()
                    true
                }

                else -> false
            }
        }
    }
}