package starwarskotlin.devhernand.com.br.starwarskotlin

import junit.framework.Assert.assertEquals
import org.junit.Assert
import org.junit.Test

/**
 * Created by Nando on 22/10/2017.
 */
class FilteringOperationsTest{

    val list = listOf(1, 2, 3, 4, 5, 6)

    /**
     * Returns a list containing all elements except first n elements.
     */
    @Test
    fun dropTest() {
        assertEquals(listOf(5, 6), list.drop(4))
    }
}