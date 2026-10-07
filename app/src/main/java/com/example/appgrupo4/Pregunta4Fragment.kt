package com.example.appgrupo4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.appgrupo4.databinding.FragmentPregunta4Binding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

// Es vital implementar View.OnClickListener para el puntaje máximo
class Pregunta4Fragment : Fragment(), View.OnClickListener {

    private var _binding: FragmentPregunta4Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentPregunta4Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Configuramos la lista
        binding.recyclerViewProducts.layoutManager = LinearLayoutManager(requireContext())

        // Asociamos el clic del botón a la interfaz de la clase
        binding.btnCargar.setOnClickListener(this)
    }

    // Método exigido por View.OnClickListener
    override fun onClick(v: View?) {
        if (v?.id == binding.btnCargar.id) {
            fetchProducts()
        }
    }

    // Función para consumir la API
    private fun fetchProducts() {
        ApiService.create().getProducts().enqueue(object : Callback<ProductResponse> {
            override fun onResponse(call: Call<ProductResponse>, response: Response<ProductResponse>) {
                if (response.isSuccessful) {
                    val products = response.body()?.products ?: emptyList()
                    // Enviamos los productos al adaptador
                    binding.recyclerViewProducts.adapter = ProductAdapter(products)
                    Toast.makeText(requireContext(), "Lista cargada", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(requireContext(), "Error en el servidor", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onFailure(call: Call<ProductResponse>, t: Throwable) {
                Toast.makeText(requireContext(), "Error de red: ${t.message}", Toast.LENGTH_SHORT).show()
            }
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}