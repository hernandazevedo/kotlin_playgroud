package starwarskotlin.devhernand.com.br.starwarskotlin

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import org.jetbrains.anko.find
import starwarskotlin.devhernand.com.br.starwarskotlin.domain.Forecast
import starwarskotlin.devhernand.com.br.starwarskotlin.domain.ForecastList

/**
 * Created by Nando on 13/10/2017.
 * Same as ForecastListAdapter3 but now using lambdas
 */
class ForecastListAdapter4(val weekForecast: ForecastList, private val onItemClickListener: (forecast : Forecast) -> Unit):
    RecyclerView.Adapter<ForecastListAdapter4.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ForecastListAdapter4.ViewHolder {
        val view = LayoutInflater.from(parent?.context)
                .inflate(R.layout.item_forecast, parent, false)
        return ViewHolder(view,onItemClickListener)
    }

    override fun onBindViewHolder(holder: ForecastListAdapter4.ViewHolder?, position: Int) {
        holder?.bindForecast(weekForecast[position])
    }

    override fun getItemCount(): Int = weekForecast.size


    class ViewHolder(view: View, private val itemClick: (forecast : Forecast) -> Unit) : RecyclerView.ViewHolder(view){

        private val iconView = view.find<ImageView>(R.id.icon)
        private val dateView = view.find<TextView>(R.id.date)
        private val descriptionView =
                view.find<TextView>(R.id.description)
        private val maxTemperatureView =
                view.find<TextView>(R.id.maxTemperature)
        private val minTemperatureView =
                view.find<TextView>(R.id.minTemperature)

        fun bindForecast(forecast: Forecast) {
            with(forecast) {
                Picasso.with(itemView.context).load(iconUrl).into(iconView)
                dateView.text = date
                descriptionView.text = description
                maxTemperatureView.text = "$high"
                minTemperatureView.text = "$low"
                itemView.setOnClickListener {itemClick(this)}
            }

        }

    }

    interface OnItemClickListener {
        operator fun invoke(forecast: Forecast)
    }

}