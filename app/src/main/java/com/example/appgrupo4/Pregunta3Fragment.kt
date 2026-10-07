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
            Animal(1, "Vaca", "https://es.wikipedia.org/wiki/Bos_taurus#/media/Archivo:20100516_Vacas_Vilarromar%C3%ADs,_Oroso-8-1.jpg"),
            Animal(2, "Mono", "https://es.wikipedia.org/wiki/Ateles#/media/Archivo:Ateles_fusciceps_Colombia.JPG"),
            Animal(3, "Llama", "https://upload.wikimedia.org/wikipedia/commons/c/c6/Lama_glama_%28Llama%29_white_fur.jpg?utm_source=es.wikipedia.org&utm_campaign=index&utm_content=original"),
            Animal(4, "Elefante", "https://upload.wikimedia.org/wikipedia/commons/d/dc/Elephant_near_ndutu.jpg?utm_source=es.wikipedia.org&utm_campaign=imageinfo&utm_content=original"),
            Animal(5, "Leon", "https://es.wikipedia.org/wiki/Panthera_leo#/media/Archivo:002_The_lion_king_Snyggve_in_the_Serengeti_National_Park_Photo_by_Giles_Laurent.jpg"),
            Animal(6, "Tigre", "https://upload.wikimedia.org/wikipedia/commons/5/54/Tigress_at_Jim_Corbett_National_Park.jpg?utm_source=es.wikipedia.org&utm_campaign=imageinfo&utm_content=original"),
            Animal(7, "Zebra", "https://upload.wikimedia.org/wikipedia/commons/f/f2/Beautiful_Zebra_in_South_Africa.JPG?utm_source=es.wikipedia.org&utm_campaign=imageinfo&utm_content=original"),
            Animal(8, "Jirafa", "https://upload.wikimedia.org/wikipedia/commons/e/e0/Giraffa_camelopardalis_angolensis.jpg?utm_source=es.wikipedia.org&utm_campaign=imageinfo&utm_content=original"),
            Animal(9, "Pez", "https://upload.wikimedia.org/wikipedia/commons/3/31/Fish_diversity.jpg?utm_source=es.wikipedia.org&utm_campaign=imageinfo&utm_content=original"),
            Animal(10, "Perro", "https://upload.wikimedia.org/wikipedia/commons/8/8c/Poligraf_Poligrafovich.JPG?utm_source=es.wikipedia.org&utm_campaign=imageinfo&utm_content=original"),
            Animal(11, "Gato", "https://upload.wikimedia.org/wikipedia/commons/4/4d/Cat_November_2010-1a.jpg?utm_source=es.wikipedia.org&utm_campaign=imageinfo&utm_content=original"),
            Animal(12, "Gallina", "https://upload.wikimedia.org/wikipedia/commons/4/43/Coq_orpington_fauve.JPG?utm_source=es.wikipedia.org&utm_campaign=imageinfo&utm_content=original"),
            Animal(13, "Gallo", "https://upload.wikimedia.org/wikipedia/commons/6/60/Rooster_portrait2.jpg?utm_source=es.wikipedia.org&utm_campaign=imageinfo&utm_content=original"),
            Animal(14, "Pavo", "https://upload.wikimedia.org/wikipedia/commons/d/d0/Male_north_american_turkey_supersaturated.jpg?utm_source=es.wikipedia.org&utm_campaign=imageinfo&utm_content=original"),
            Animal(15, "Oso", "https://upload.wikimedia.org/wikipedia/commons/8/8a/Ursus_arctos_Dessin_ours_brun_grand.jpg?utm_source=es.wikipedia.org&utm_campaign=imageinfo&utm_content=original"),
            Animal(16, "Castor", "https://upload.wikimedia.org/wikipedia/commons/5/54/Beaver-Szmurlo.jpg?utm_source=es.wikipedia.org&utm_campaign=imageinfo&utm_content=original"),
            Animal(17, "Capibara", "https://upload.wikimedia.org/wikipedia/commons/3/34/Hydrochoeris_hydrochaeris_in_Brazil_in_Petr%C3%B3polis%2C_Rio_de_Janeiro%2C_Brazil_09.jpg?utm_source=es.wikipedia.org&utm_campaign=imageinfo&utm_content=original"),
            Animal(18, "Araña", "https://upload.wikimedia.org/wikipedia/commons/a/a3/Latonigena_auricomis.jpg?utm_source=es.wikipedia.org&utm_campaign=imageinfo&utm_content=original"),
            Animal(19, "Hamster", "https://upload.wikimedia.org/wikipedia/commons/0/01/Hamster_im_Gras.jpg?utm_source=es.wikipedia.org&utm_campaign=imageinfo&utm_content=original"),
            Animal(20, "Venado", "https://upload.wikimedia.org/wikipedia/commons/4/4b/Silz_cerf20-2.jpg?utm_source=es.wikipedia.org&utm_campaign=imageinfo&utm_content=original")
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}