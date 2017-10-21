package starwarskotlin.devhernand.com.br.starwarskotlin.domain.commands

/**
 * Created by Nando on 07/10/2017.
 */
public interface Command<out T> {
     fun execute(): T
}