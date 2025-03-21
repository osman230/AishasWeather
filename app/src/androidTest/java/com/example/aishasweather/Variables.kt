package com.example.aishasweather

class Variables (
    val main: Main,
    val wind: Wind,
    val weather: List<Weather>,
    val city: String
    )

    data class Main(
        val temp: Double,
        val humidity: Int
    )

    data class Weather(
        val description: String
    )

    data class Wind(
        val speed: Double
    )

