package com.example.aishasweather.api

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.aishasweather.R
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.getAndUpdate
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class APIViewModel(private val context: Context) : ViewModel(){
    private val dataLayer = DataLayer(context)
    private val _weatherResponse = MutableLiveData<WeatherData?>()
    val weatherResponse: LiveData<WeatherData?> = _weatherResponse

    fun fetchWeatherData() {
        val lat = context.getString(R.string.lat)
        val lon = context.getString(R.string.lon)
        val appid = context.getString(R.string.appid)

        dataLayer.getWeatherData(lat, lon, appid).enqueue(object : Callback<WeatherData> {
            override fun onResponse(call: Call<WeatherData>, response: Response<WeatherData>) {
                if (response.isSuccessful) {
                    _weatherResponse.value = response.body()
                    println("Weather Data: ${response.body()}")
                } else {
                    println("something went wrong fetching weather data: ${response.code()}")
                }
            }

            override fun onFailure(call: Call<WeatherData>, t: Throwable) {
                println("something went wrong fetching weather data: ${t.message}")
            }
        })
    }

}

