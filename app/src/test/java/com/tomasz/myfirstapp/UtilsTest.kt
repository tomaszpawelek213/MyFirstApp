package com.tomasz.myfirstapp

import org.junit.Assert.assertEquals
import org.junit.Test

class UtilsTest {

    @Test
    fun `should add two numbers 1`() {
        val result = add(5, 6)

        assertEquals(11, result)
    }

    @Test
    fun `should add two numbers 2`() {
        val result = add(-1, -1)

        assertEquals(-2, result)
    }

    @Test
    fun `should add two numbers 3`() {
        val result = add(0, 0)

        assertEquals(0, result)
    }

    @Test
    fun `should add two numbers 4`() {
        val result = add(1, 6)

        assertEquals(7, result)
    }

    @Test
    fun `should add two numbers 5`() {
        val result = add(2, -5)

        assertEquals(-3, result)
    }
}