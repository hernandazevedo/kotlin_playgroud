package starwarskotlin.devhernand.com.br.starwarskotlin.domain

import java.text.FieldPosition

/**
 * Created by Nando on 07/10/2017.
 */
data class ForecastList(val city: String, val country: String,
                        val dailyForecast:List<Forecast>){
    val size: Int get() = dailyForecast.size

    operator fun get(position: Int) : Forecast = dailyForecast[position]
}
data class Forecast(val date: String, val description: String, val high: Int,
                     val low: Int,val iconUrl : String = "")

class Configuration(map: Map<String, Any?>) {
    val width: Int by map
    val height: Int by map
    val dp: Int by map
    val deviceName: String by map
}