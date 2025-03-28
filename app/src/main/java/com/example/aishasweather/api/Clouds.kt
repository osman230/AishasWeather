package com.example.aishasweather.api

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Clouds (
    @SerialName("all") val all: Int
)