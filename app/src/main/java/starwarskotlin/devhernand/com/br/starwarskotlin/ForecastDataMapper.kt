package starwarskotlin.devhernand.com.br.starwarskotlin

import starwarskotlin.devhernand.com.br.starwarskotlin.domain.ForecastList
import starwarskotlin.devhernand.com.br.starwarskotlin.data.ForecastResult
import java.text.DateFormat
import java.util.*
import java.util.concurrent.TimeUnit
import starwarskotlin.devhernand.com.br.starwarskotlin.domain.Forecast as DomainModelForecast
import starwarskotlin.devhernand.com.br.starwarskotlin.data.Forecast as DataModelForecast

/**
 * Created by Nando on 07/10/2017.
 */

class ForecastDataMapper{

    fun convertFromDataModel(forecast: ForecastResult) : ForecastList = ForecastList(forecast.city.name, forecast.city.country, convertForecastListToDomain(forecast.list))

    fun convertForecastListToDomain(list: List<DataModelForecast>): List<DomainModelForecast> {
        return list.mapIndexed{
            i,forecast ->
            val dt = Calendar.getInstance().timeInMillis + TimeUnit.DAYS.toMillis(i.toLong())
            convertForecastItemToDomain(forecast.copy(dt = dt))
        }

    }



    private fun convertForecastItemToDomain(forecast: DataModelForecast): DomainModelForecast {

        return DomainModelForecast(convertDate(forecast.dt), forecast.weather[0].description,
        forecast.temp.max.toInt(), forecast.temp.min.toInt(),generateIconUrl(forecast.weather[0].icon))
    }

    private fun convertDate(date: Long): String {
        val df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.getDefault())
        return df.format(date)
    }

    private fun generateIconUrl(iconCode: String): String = "http://openweathermap.org/img/w/$iconCode.png"
}