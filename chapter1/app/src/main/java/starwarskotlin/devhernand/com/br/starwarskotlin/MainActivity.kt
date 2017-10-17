package starwarskotlin.devhernand.com.br.starwarskotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.item_forecast.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.toast
import org.jetbrains.anko.uiThread
import starwarskotlin.devhernand.com.br.starwarskotlin.domain.Forecast

class MainActivity : AppCompatActivity() {

    private val items = listOf<String>("Mon 6/23 - Sunny - 31/17",
             "Tue 6/24 - Foggy - 21/8",
             "Wed 6/25 - Cloudy - 22/17",
             "Thurs 6/26 - Rainy - 18/11",
             "Fri 6/27 - Foggy - 21/10",
             "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18",
             "Sun 6/29 - Sunny - 20/7")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val forecastList = findViewById<RecyclerView>(R.id.forecast_list)
        forecastList.layoutManager = LinearLayoutManager(this)
//        forecastList.adapter = ForecastListAdapter(items)


        Extensions().withMore(""){

        }
//        val doAsync = doAsync {
//            Request("https://github.com/hernandazevedo/kotlin_tests/blob/master/README.md").run()
//            uiThread { toast("Request Performed") }
//
//        }

//        val forecast = Forecast();
//        val forecast2 = forecast.copy()


        doAsync() {
            val result = RequestForecastCommand("94043").execute()
            uiThread {
//                forecastList.adapter = ForecastListAdapter2(result)

//                forecastList.adapter = ForecastListAdapter3(result,
//                        object : ForecastListAdapter3.OnItemClickListener{
//                            override fun invoke(forecast: Forecast) {
//                                toast(forecast.date)
//                            }
//                        })

                forecastList.adapter = ForecastListAdapter4(result,{toast(it.date)})
            }
        }


    }


}
