package com.example.appgrupo4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.appgrupo4.databinding.FragmentPregunta1Binding

class Pregunta1Fragment : Fragment(), View.OnClickListener {

    private var _binding: FragmentPregunta1Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPregunta1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnCalcular.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v == binding.btnCalcular) {
            calcular()
        }
    }

    private fun calcular() {
        val txtPeso = binding.etPeso.text.toString().trim()

        if (txtPeso.isEmpty()) {
            Toast.makeText(requireContext(), "Ingrese el peso de la mascota", Toast.LENGTH_SHORT).show()
            limpiarCampos()
            return
        }

        val peso = txtPeso.toDoubleOrNull()
        if (peso == null || peso <= 0) {
            Toast.makeText(requireContext(), "Ingrese un peso válido", Toast.LENGTH_SHORT).show()
            limpiarCampos()
            return
        }

        if (peso <= 8.0) {
            binding.tvResultadoEstado.text = "Mascota apta para viajar en cabina sin sobrecosto."
            binding.tvDetallePesoTotal.text = ""
            binding.tvDetalleExceso.text = ""
            binding.tvDetalleMonto.text = ""
        } else {
            val exceso = peso - 8.0
            val total = 150.0 + (exceso * 35.0)

            binding.tvResultadoEstado.text = "Aplica recargo"
            binding.tvDetallePesoTotal.text = "Peso total ingresado: ${String.format("%.2f", peso)} kg"
            binding.tvDetalleExceso.text = "Exceso de peso: ${String.format("%.2f", exceso)} kg"
            binding.tvDetalleMonto.text = "Monto total a pagar por recargo: S/ ${String.format("%.2f", total)}"
        }
    }

    private fun limpiarCampos() {
        binding.tvResultadoEstado.text = ""
        binding.tvDetallePesoTotal.text = ""
        binding.tvDetalleExceso.text = ""
        binding.tvDetalleMonto.text = ""
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}