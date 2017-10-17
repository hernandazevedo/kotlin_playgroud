package starwarskotlin.devhernand.com.br.starwarskotlin

import android.app.Application

/**
 * Created by Nando on 17/10/2017.
 */
class App : Application() {

    companion object {
        lateinit var instance: App
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}