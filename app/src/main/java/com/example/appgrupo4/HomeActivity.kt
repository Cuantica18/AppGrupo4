package com.example.appgrupo4

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.appgrupo4.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, Pregunta1Fragment())
                .commit()
        }

        binding.bottomNavigation.setOnItemSelectedListener { item ->

            when (item.itemId) {

                R.id.nav_pregunta1 -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, Pregunta1Fragment())
                        .commit()
                    true
                }

                R.id.nav_pregunta2 -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, Pregunta2Fragment())
                        .commit()
                    true
                }

                R.id.nav_pregunta3 -> {
                    supportFragmentManager.beginTransaction()
                        // FRAGMENTO 3 SE GENERA FRAGMENTO
                        .replace(R.id.fragmentContainer, Pregunta3Fragment())
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
