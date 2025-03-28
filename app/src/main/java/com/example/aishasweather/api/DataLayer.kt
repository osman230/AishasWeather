package com.example.aishasweather.api

import android.content.Context
import com.example.aishasweather.R
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Call
import retrofit2.Retrofit


class DataLayer (context: Context) {

    val retroFit: Retrofit = Retrofit.Builder()
        .baseUrl(context.getString(R.string.uri))
        .addConverterFactory(Json.asConverterFactory("application/json; charset=UTF8".toMediaType()))
        .build()

    private val api: CurrentsAPI = retroFit.create(CurrentsAPI::class.java)

    fun getWeatherData(lat: String, lon: String, appid: String): Call<WeatherData> {
        return api.getWeather(lat, lon, appid)
    }

}