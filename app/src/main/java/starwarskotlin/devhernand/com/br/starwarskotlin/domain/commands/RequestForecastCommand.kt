package starwarskotlin.devhernand.com.br.starwarskotlin.domain.commands

import starwarskotlin.devhernand.com.br.starwarskotlin.domain.mappers.ForecastDataMapper
import starwarskotlin.devhernand.com.br.starwarskotlin.data.ForecastRequest
import starwarskotlin.devhernand.com.br.starwarskotlin.domain.model.ForecastList

/**
 * Created by Nando on 07/10/2017.
 */
class RequestForecastCommand(private val zipCode: String) : Command<ForecastList> {
    override fun execute(): ForecastList {
        var forecastRequest = ForecastRequest(zipCode)
        return ForecastDataMapper().convertFromDataModel(forecastRequest.execute())

    }
}