package starwarskotlin.devhernand.com.br.starwarskotlin.domain

/**
 * Created by Nando on 07/10/2017.
 */
data class ForecastList(val city: String, val country: String,
                        val dailyForecast:List<Forecast>)
data class Forecast(val date: String, val description: String, val high: Int,
                     val low: Int)