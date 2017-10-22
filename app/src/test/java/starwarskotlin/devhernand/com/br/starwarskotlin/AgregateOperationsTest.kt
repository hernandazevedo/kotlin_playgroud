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
    fun any_operation(){
        assertTrue(list.any { it % 2 == 0 })
        assertFalse(list.any { it > 10 })
    }
    /*
    Returns true if all the elements match the given predicate.
     */
    @Test
    fun all_operation(){
        assertTrue(list.all { it < 10 })
        assertFalse(list.all { it % 2 == 0 })
    }

    /*
    Returns the number of elements matching the given predicate.
     */
    @Test
    fun count_operation(){
        assertEquals(3,list.count{ it%2 == 0})
    }

    /*
    Accumulates the value starting with an initial value and applying an operation from
    the first to the last element in a collection.
     */
    @Test
    fun fold_operation(){
        assertEquals(25, list.fold(4) { total, next -> total + next })
    }

    /*
    Same as fold, but it goes from the last element to first.
     */
    @Test
    fun foldRight_operation(){
        assertEquals(25, list.foldRight(4) { total, next -> total + next })
    }
}