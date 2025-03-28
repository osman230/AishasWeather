package com.example.aishasweather.api

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WeatherData(
    @SerialName("coord") val coord: Coord,
    @SerialName("weather") val weather: List<Weather>,
    @SerialName("base") val base: String,
    @SerialName("main") val main: Main,
    @SerialName("visibility") val visibility: String,
    @SerialName("wind") val wind : Wind,
    @SerialName("rain") val rain : Rain,
    @SerialName("clouds") val clouds : Clouds,
    @SerialName("dt") val dt : Double,
    @SerialName("sys") val sys: Sys,
    @SerialName("timezone") val timezone: Int,
    @SerialName("id") val id : Int,
    @SerialName("name") val name: String,
    @SerialName("cod") val cod: Int
)