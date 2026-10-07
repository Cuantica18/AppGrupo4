package com.example.appgrupo4

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

// Modelos de datosdata class ProductResponse(val products: List<Product>)

data class Product(
    val id: Int,
    val title: String,
    val price: Double,
    val category: String,
    val thumbnail: String
)


interface ApiService {
    @GET("products")
    fun getProducts(): Call<ProductResponse>

    companion object {
        fun create(): ApiService {
            return Retrofit.Builder()
                .baseUrl("https://dummyjson.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ApiService::class.java)
        }
    }
}