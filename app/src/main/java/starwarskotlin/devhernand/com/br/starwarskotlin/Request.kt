package starwarskotlin.devhernand.com.br.starwarskotlin

import android.util.Log
import java.net.URL

/**
 * Created by Nando on 07/10/2017.
 */
class Request(private val url: String){

    fun run(){
        val forecastJsonStr = URL(url).readText()
        Log.d(javaClass.simpleName,forecastJsonStr)
    }

}