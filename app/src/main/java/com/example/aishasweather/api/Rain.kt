package com.example.aishasweather.api

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Rain (
    @SerialName("1h") val oneH: String
)