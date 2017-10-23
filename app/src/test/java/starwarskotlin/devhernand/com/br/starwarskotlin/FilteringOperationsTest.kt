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

    /*
    Returns a list containing all elements except first elements that satisfy the given
    predicate.
     */
    @Test
    fun dropWhileTest(){
        assertEquals(listOf(3,4,5,6),list.dropWhile { it < 3 })
    }

    /*
    Returns a list containing all elements except last elements that satisfy the given
    predicate.
     */
    @Test
    fun dropLastWhileTest(){
        assertEquals(listOf(1, 2, 3, 4), list.dropLastWhile { it > 4 })
    }

    /*
    Returns a list containing all elements matching the given predicate.
     */
    @Test
    fun filterTest(){
        assertEquals(listOf(2, 4, 6), list.filter { it % 2 == 0 })
    }

    /*
    Returns a list containing all elements not matching the given predicate.
     */
    @Test
    fun filterNotTest(){
        assertEquals(listOf(1, 3, 5), list.filterNot { it % 2 == 0 })
    }

    /*
    Returns a list containing all elements that are not null.
     */
    @Test
    fun filterNotNullTest(){
        val listWithNull = listOf(1, null, 2, 3, null, 4)
        assertEquals(listOf(1, 2, 3, 4), listWithNull.filterNotNull())
    }

    /*
    Returns a list containing elements at specified indices.
     */
    @Test
    fun sliceTest(){
        assertEquals(listOf(2, 4, 5), list.slice(listOf(1, 3, 4)))
    }

    /*
    Returns a list containing first n elements.
     */
    @Test
    fun takeTest(){
        assertEquals(listOf(1, 2), list.take(2))
    }

    /*
    Returns a list containing last n elements.
     */
    @Test
    fun takeLastTest(){
        assertEquals(listOf(5, 6), list.takeLast(2))
    }

    /*
    Returns a list containing first elements satisfying the given predicate.
     */

    @Test
    fun takeWhile(){
        assertEquals(listOf(1, 2), list.takeWhile { it < 3 })
    }
}