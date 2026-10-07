package com.example.appgrupo4

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.appgrupo4.databinding.ActivityPregunta1Binding

data class Usuario(
    val usuario: String,
    val password: String
)

class Pregunta1Activity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityPregunta1Binding

    private val listaUsuarios = listOf(
        //Astrid Abigail Ismiño Ruíz
        Usuario("i202216656", "75921551"),
        //Anyelo Fabricio Valdivia Manrique
        Usuario("i202510846", "61048246"),
        //Albert Naim Canchuricra Caro
        Usuario("i202503973", "70727841"),
        // Arturo sebastian huaman sota
        Usuario("i202330687", "72440786"),
        //Jhojan Enriquez Villafranca
        Usuario("i202504171", "60781417"),
        //Carlos Zair Guadalupe Veis
        Usuario("i202503880", "76867949"),
        //Desiderio Vásquez Dejo
        Usuario("i202506964", "71536820")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPregunta1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnIngresar.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btnIngresar) {
            val usuario = binding.etUsuario.text.toString().trim()
            val password = binding.etPassword.text.toString().trim()
            login(usuario, password)
        }
    }

    private fun login(usuario: String, password: String) {
        if (usuario.isBlank() || password.isBlank()) {
            Toast.makeText(this, "Ingrese usuario y contraseña", Toast.LENGTH_SHORT).show()
            return
        }

        if (validarCredenciales(usuario, password)) {
            val intent = Intent(this, HomeActivity::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                putExtra("CODIGO_USUARIO", usuario)
            }
            startActivity(intent)
            finish()
        } else {
            Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show()
            binding.etPassword.text.clear()
            binding.etPassword.requestFocus()
        }
    }

    // Función que verifica si las credenciales coinciden exactamente con la lista
    private fun validarCredenciales(usuario: String, password: String): Boolean {
        return listaUsuarios.any {
            it.usuario == usuario && it.password == password
        }
    }
}