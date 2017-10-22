package starwarskotlin.devhernand.com.br.starwarskotlin

import junit.framework.Assert.*
import org.junit.Test

/**
 * Created by Nando on 21/10/2017.
 */
class AgregateOperationsTest {

    val list = listOf(1, 2, 3, 4, 5, 6)

    /*
    Returns true if at least one element matches the given predicate.
     */
    @Test
    fun anyTest(){
        assertTrue(list.any { it % 2 == 0 })
        assertFalse(list.any { it > 10 })
    }
    /*
    Returns true if all the elements match the given predicate.
     */
    @Test
    fun allTest(){
        assertTrue(list.all { it < 10 })
        assertFalse(list.all { it % 2 == 0 })
    }

    /*
    Returns the number of elements matching the given predicate.
     */
    @Test
    fun countTest(){
        assertEquals(3,list.count{ it%2 == 0})
    }

    /*
    Accumulates the value starting with an initial value and applying an operation from
    the first to the last element in a collection.
     */
    @Test
    fun foldTest(){
        assertEquals(25, list.fold(4) { total, next -> total + next })
    }

    /*
    Same as fold, but it goes from the last element to first.
     */
    @Test
    fun foldRightTest(){
        assertEquals(25, list.foldRight(4) { total, next -> total + next })
    }

    /*
    Performs the given operation to each element.
     */
    @Test
    fun forEachTest(){
        list.forEach { println(it) }
    }

    /*
    Same as forEach, though we also get the index of the element.
     */
    @Test
    fun forEachIndexedTest(){
        list.forEachIndexed { index, value ->
            println("position $index contains a $value")
        }
    }

    /*
    Returns the largest element or null if there are no elements.
     */
    @Test
    fun maxTest(){
        assertEquals(6,list.max())
    }

    /*
    Returns the first element yielding the largest value of the given function or null if
    there are no elements.
     */
    @Test
    fun maxByTest(){
        // The element whose negative is greater
        assertEquals(1, list.maxBy { -it })
    }

    /*
    Returns the smallest element or null if there are no elements.
     */
    @Test
    fun minTest(){
        assertEquals(1, list.min())
    }

    /*
    Returns the first element yielding the smallest value of the given function or null if
    there are no elements.
     */
    @Test
    fun minByTest(){
        assertEquals(6,list.minBy { -it })
    }

    /*
    Returns true if no elements match the given predicate.
     */
    @Test
    fun noneTest(){
        assertTrue(list.none{it % 7 == 0})
    }

    /*
    Same as fold, but it doesn’t use an initial value. It accumulates the value applying
    an operation from the first to the last element in a collection.
     */
    @Test
    fun reduceTest(){
        assertEquals(21, list.reduce { total, next -> total + next })
    }

    /*
    Same as reduce, but it goes from the last element to first.
    */
    @Test
    fun reduceRightTest(){
        assertEquals(21, list.reduceRight { total, next -> total + next })
    }
    /*
    Returns the sum of all values produced by the transform function from the elements
    in the collection.
     */
    @Test
    fun sumByTest(){
        assertEquals(3, list.sumBy { it % 2 })
    }
}