package starwarskotlin.devhernand.com.br.starwarskotlin.ui.adapters
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView
import starwarskotlin.devhernand.com.br.starwarskotlin.domain.model.ForecastList

/**
 * Created by Nando on 07/10/2017.
 */
class ForecastListAdapter2(val weekendForecast : ForecastList) : RecyclerView.Adapter<ForecastListAdapter2.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        return ViewHolder(TextView(parent?.context))
    }

    override fun getItemCount(): Int = weekendForecast.dailyForecast.size

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        with(weekendForecast.dailyForecast[position]){
            holder?.textView?.text = "$date - $description - $high/$low"
        }
    }


    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)

}