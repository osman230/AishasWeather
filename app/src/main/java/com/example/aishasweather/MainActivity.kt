import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.weatherapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: WeatherViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.weatherData.observe(this, Observer { weather ->
            binding.cityName.text = "City: ${weather.name}"
            binding.temperature.text = "Temp: ${weather.main.temp}°C"
            binding.description.text = "Condition: ${weather.weather[0].description}"
        })

        // Fetch data for a sample city
        viewModel.fetchWeather(" Saint Paul")
    }
}