package com.example.aishasweather.api

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Sys (
    @SerialName("type") val type: Int,
    @SerialName("id") val id: Int,
    @SerialName("country") val country: String,
    @SerialName("sunrise") val sunrise: Int,
    @SerialName("sunset") val sunset: String
)