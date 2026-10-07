package com.example.appgrupo4.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.appgrupo4.databinding.ItemAnimalBinding
import com.example.appgrupo4.model.Animal

class AnimalAdapter(private var listaAnimal: List<Animal>)
    : RecyclerView.Adapter<AnimalAdapter.ViewHolder>(){

    inner class ViewHolder(val binding: ItemAnimalBinding)
        : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AnimalAdapter.ViewHolder {
        val binding = ItemAnimalBinding.inflate(
            LayoutInflater.from(parent.context), parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AnimalAdapter.ViewHolder, position: Int) {
        with(holder){
            with(listaAnimal[position]){
                binding.tvnombre.text = nombre
                Glide.with(itemView.context)
                    .load(urlImagen)
                    .into(binding.ivanimal)
            }
        }
    }

    override fun getItemCount() = listaAnimal.size
}