package starwarskotlin.devhernand.com.br.starwarskotlin.data

/**
 * Created by Nando on 07/10/2017.
 */
data class ForecastResult(val city: City, val list: List<Forecast>)

data class City(val id: Long, val name: String, val coord: Coordinates,
                val country: String, val population: Int)

data class Coordinates(val lon: Float, val lat: Float)
data class Forecast(var dt: Long = 0L, var temp: Temperature, var pressure: Float = 0f,
                    var humidity: Int = 0, var weather: List<Weather> = emptyList(),
                    var speed: Float = 0f, var deg: Int = 0, var clouds: Int = 0,
                    var rain: Float = 0f)

data class Temperature(val day: Float, val min: Float, val max: Float,
val night: Float, val eve: Float, val morn: Float)

data class Weather(val id: Long, val main: String, val description: String,
val icon: String)