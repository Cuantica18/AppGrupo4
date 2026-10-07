package com.example.appgrupo4

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.appgrupo4.databinding.ItemProductBinding

class ProductAdapter(private val productList: List<Product>) : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    class ProductViewHolder(val binding: ItemProductBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val binding = ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProductViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = productList[position]

        // Asignamos los textos requeridos por la rúbrica
        holder.binding.tvTitle.text = product.title
        holder.binding.tvCategory.text = "Categoría: ${product.category}"
        holder.binding.tvPrice.text = "Precio: $${product.price}"

        // Descargamos y mostramos la imagen miniatura con Glide
        Glide.with(holder.itemView.context)
            .load(product.thumbnail)
            .into(holder.binding.ivThumbnail)
    }

    override fun getItemCount(): Int = productList.size
}