package com.example.appgrupo4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.appgrupo4.adapter.AnimalAdapter
import com.example.appgrupo4.databinding.FragmentPregunta5Binding
import com.example.appgrupo4.model.Animal

class Pregunta3Fragment : Fragment() {

    private var _binding: FragmentPregunta5Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPregunta5Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Configuración del RecyclerView
        binding.rvanimales.layoutManager = LinearLayoutManager(requireContext())
        binding.rvanimales.adapter = AnimalAdapter(getAnimales())
    }

    private fun getAnimales(): List<Animal> {
        return listOf(

            Animal(
                1,
                "Vaca",
                "https://commons.wikimedia.org/wiki/Special:Redirect/file/Cow_animal.jpg"
            ),

            Animal(
                2,
                "Mono",
                "https://commons.wikimedia.org/wiki/Special:Redirect/file/Colobus_monkey.jpg"
            ),

            Animal(
                3,
                "Llama",
                "https://commons.wikimedia.org/wiki/Special:Redirect/file/Llama.jpg"
            ),

            Animal(
                4,
                "Elefante",
                "https://commons.wikimedia.org/wiki/Special:Redirect/file/Elephant.jpg"
            ),

            Animal(
                5,
                "Leon",
                "https://commons.wikimedia.org/wiki/Special:Redirect/file/The_LION_.jpg"
            ),

            Animal(
                6,
                "Tigre",
                "https://commons.wikimedia.org/wiki/Special:Redirect/file/Tiger_image.JPG"
            ),

            Animal(
                7,
                "Zebra",
                "https://commons.wikimedia.org/wiki/Special:Redirect/file/Common_zebra.jpg"
            ),

            Animal(
                8,
                "Jirafa",
                "https://commons.wikimedia.org/wiki/Special:Redirect/file/Giraffe.jpg"
            ),

            Animal(
                9,
                "Pez",
                "https://commons.wikimedia.org/wiki/Special:Redirect/file/Fish.jpg"
            ),

            Animal(
                10,
                "Perro",
                "https://commons.wikimedia.org/wiki/Special:Redirect/file/Dog_.jpg"
            ),

            Animal(
                11,
                "Gato",
                "https://commons.wikimedia.org/wiki/Special:Redirect/file/Cat_.jpg"
            ),

            Animal(
                12,
                "Gallina",
                "https://commons.wikimedia.org/wiki/Special:Redirect/file/Chicken.jpg"
            ),

            Animal(
                13,
                "Gallo",
                "https://commons.wikimedia.org/wiki/Special:Redirect/file/Rooster.jpg"
            ),

            Animal(
                14,
                "Pavo",
                "https://commons.wikimedia.org/wiki/Special:Redirect/file/A_turkey.jpg"
            ),

            Animal(
                15,
                "Oso",
                "https://commons.wikimedia.org/wiki/Special:Redirect/file/Bear.jpg"
            ),

            Animal(
                16,
                "Castor",
                "https://commons.wikimedia.org/wiki/Special:Redirect/file/Beaver.jpg"
            ),

            Animal(
                17,
                "Capibara",
                "https://commons.wikimedia.org/wiki/Special:Redirect/file/Capybara.jpg"
            ),

            Animal(
                18,
                "Araña",
                "https://commons.wikimedia.org/wiki/Special:Redirect/file/Spider.jpg"
            ),

            Animal(
                19,
                "Hamster",
                "https://commons.wikimedia.org/wiki/Special:Redirect/file/Hamster_(1).jpg"
            ),

            Animal(
                20,
                "Venado",
                "https://commons.wikimedia.org/wiki/Special:Redirect/file/Deer.jpg"
            )
        )
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}