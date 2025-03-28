package com.example.aishasweather.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrentsAPI {
    @GET("data/2.5/weather")
    fun getWeather(
        @Query("lat") lat: String,
        @Query("lon") lon: String,
        @Query("appid") appId: String
    ): Call<WeatherData>
}