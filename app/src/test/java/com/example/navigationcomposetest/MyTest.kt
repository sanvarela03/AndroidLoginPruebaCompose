package com.example.navigationcomposetest

import org.junit.Test


class MyTest {

    @Test
    fun functionsTest() {
        val items = listOf(1, 2, 3, 4, 5)

        val r = items.fold(0, { acc: Int, i: Int ->
            val result = acc + i
            result
        })

        val joinedToString = items
            .fold("Elements:", { acc, i -> acc + " " + i })


        val product = items.fold(1, Int::times)
        println(r)
        println(" .. ")
        println(joinedToString)
        println(" .. ")
        println(product)

    }
}