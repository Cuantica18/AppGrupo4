package com.example.appgrupo4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.appgrupo4.databinding.FragmentPregunta2Binding
import java.util.Locale

class Pregunta2Fragment : Fragment(), View.OnClickListener {

    private lateinit var binding: FragmentPregunta2Binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentPregunta2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnCalcular.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        if (v?.id == R.id.btnCalcular) {
            calcularPenalizacion()
        }
    }

    private fun calcularPenalizacion() {

        val dato = binding.etGramos.text.toString().trim()

        if (dato.isEmpty()) {

            Toast.makeText(
                requireContext(),
                "Ingrese los gramos de comida sobrante",
                Toast.LENGTH_SHORT
            ).show()

            return
        }

        val gramos = dato.toDoubleOrNull()

        if (gramos == null) {

            Toast.makeText(
                requireContext(),
                "Ingrese una cantidad válida",
                Toast.LENGTH_SHORT
            ).show()

            return
        }

        if (gramos <= 100) {

            binding.tvResultado.text =
                "Plato dentro del margen admisible de consumo."

        } else {

            val exceso = gramos - 100
            val penalizacion = 15.00 + (exceso * 0.12)

            val gramosTexto = String.format(Locale.US, "%.2f", gramos)
            val excesoTexto = String.format(Locale.US, "%.2f", exceso)
            val penalizacionTexto = String.format(Locale.US, "%.2f", penalizacion)

            binding.tvResultado.text =
                "Gramos sobrantes pesados: $gramosTexto g\n" +
                        "Exceso de desperdicio: $excesoTexto g\n" +
                        "Penalización total por desperdicio: S/ $penalizacionTexto"
        }
    }
}