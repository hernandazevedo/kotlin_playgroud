package starwarskotlin.devhernand.com.br.starwarskotlin

import com.google.gson.Gson
import starwarskotlin.devhernand.com.br.starwarskotlin.data.ForecastResult
import java.net.URL

/**
 * Created by Nando on 07/10/2017.
 */
class ForecastRequest(private val zipCode: String){

    companion object {
        private val APP_ID = "15646a06818f61f7b8d7823ca833e1ce"
        private val API_URL = "http://api.openweathermap.org/data/2.5/" +
        "forecast/daily?mode=json&units=metric&cnt=7"
        private val COMPLETE_URL = "$API_URL&APPID=$APP_ID&q="
    }

    fun execute() : ForecastResult {

        val forecastJsonStr = URL(COMPLETE_URL + zipCode).readText()
        return Gson().fromJson(forecastJsonStr,ForecastResult::class.java)
    }
}