package com.example.aishasweather

package com.example.aishasweather

data class Receive(
    val main: Main,
    val wind: Wind,
    val weather: List<Weather>,
    val name: String
)