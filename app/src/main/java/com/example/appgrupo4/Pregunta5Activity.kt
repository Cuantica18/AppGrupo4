package com.example.appgrupo4

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.appgrupo4.adapter.AnimalAdapter
import com.example.appgrupo4.databinding.FragmentPregunta5Binding
import com.example.appgrupo4.model.Animal

class Pregunta5Activity : AppCompatActivity(){

    private lateinit var binding: FragmentPregunta5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = FragmentPregunta5Binding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.rvanimales.layoutManager = LinearLayoutManager(this)
        binding.rvanimales.adapter = AnimalAdapter(getAnimales())
    }

    fun getAnimales() : List<Animal>{
        return listOf(
            Animal( 1, "Vaca", "https://upload.wikimedia.org/wikipedia/commons/0/0c/Cow_female_black_white.jpg" ),
            Animal( 2, "Mono", "https://upload.wikimedia.org/wikipedia/commons/7/70/Capuchin_Costa_Rica.jpg" ),
            Animal( 3, "Llama", "https://upload.wikimedia.org/wikipedia/commons/0/0c/Llama_Alpaca.jpg" ),
            Animal( 4, "Elefante", "https://upload.wikimedia.org/wikipedia/commons/3/37/African_Bush_Elephant.jpg" ),
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
            Animal(20, "Venado", "https://upload.wikimedia.org/wikipedia/commons/4/4b/Silz_cerf20-2.jpg?utm_source=es.wikipedia.org&utm_campaign=imageinfo&utm_content=original"),
        )
    }
}
