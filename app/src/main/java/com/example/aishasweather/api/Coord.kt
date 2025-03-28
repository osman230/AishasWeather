package com.example.aishasweather.api

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Coord (
    @SerialName("lon") val lon: Double,
    @SerialName("lat") val lat: Double
)