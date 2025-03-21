package com.example.aishasweather

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Retro {
    private const val BASE_URL = "https://api.openweathermap.org/"

    val api: WeatherAPI by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(WeatherAPI::class.java)
    }
}