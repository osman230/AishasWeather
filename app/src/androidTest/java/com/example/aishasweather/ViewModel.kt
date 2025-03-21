package com.example.aishasweather

import androidx.lifecycle.*
import kotlinx.coroutines.launch

class WeatherViewModel : ViewModel() {
    private val _weatherData = MutableLiveData<Receive>()
    val weatherData: LiveData<Receive> = _weatherData

    private val apiKey = "8013d5ed66a421e7fc071de532e9e3ca"

    fun fetchWeather(city: String) {
        viewModelScope.launch {
            try {
                _weatherData.value = Retro.api.getWeather(city, apiKey)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}