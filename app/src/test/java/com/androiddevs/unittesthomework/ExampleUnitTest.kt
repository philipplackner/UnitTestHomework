package com.androiddevs.unittesthomework

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val result = Homework.fib(2)
        assertEquals(1,  result)
    }

    @Test
    fun addition_isInCorrect() {
        val result = Homework.fib(2)
        assertNotEquals(2,  result)
    }

    @Test
    fun `find odd braces returns false`(){
        val res =  Homework.checkBraces("(pp))")
        assertFalse(res)
    }

    @Test
    fun `find even braces returns true`(){
        val res = Homework.checkBraces("((DD))")
        assertTrue(res)
    }
}