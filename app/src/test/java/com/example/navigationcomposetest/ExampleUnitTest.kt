package com.example.navigationcomposetest

import org.junit.Test

import org.junit.Assert.*
import kotlin.math.sqrt

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun testingSomeStuff() {

        val toUpper = { string: String -> string.uppercase() }
        println(toUpper("random stuff in lowercase yep"))
    }

    @Test
    fun testingMoreRandomStuff() {
        val numbers = listOf(1, -2, 3, -4, 5, -6)

        val firstLamda = { x: Int -> x > 0 }
        val positives = numbers.filter(firstLamda)
        val negatives = numbers.filter { x -> x < 0 }
        println(positives)
        println(negatives)
    }

    @Test
    fun evenMoreStuff() {
        val listaDeNumeros = listOf<Int>(1, 2, 3, -4, 5, -6)

        val l: (Int) -> Int = { x: Int -> x * 2 }
        val l1: (Int, Int) -> Double = { x: Int, y: Int -> sqrt((x * x + y * y).toDouble()) }

        println("Lamda : ${l1(3, 2)}")
        val listaDoblada = listaDeNumeros.map(l)
        val listaTriplicada = listaDeNumeros.map { x -> x * 3 }

        println(listaDeNumeros)
        println(listaDoblada)
        println(listaTriplicada)
    }

    /**
     * Los typos funciones
     *
     *  val something : (T1, T2, ...) -> I
     * */
    @Test
    fun funtionTypes() {
        val upperCaseString: (String, String) -> String =
            { str, add -> str.uppercase().plus(" $add") }


        println(upperCaseString("so much cum yep", "FUKKKKKKKKER"))
    }

    @Test
    fun testingFunctionsThatReturnsLamdas() {

        val opciones = mapOf(1 to "hour", 2 to "minute", 3 to "second")
        val v = toSeconds(opciones[2])(1)
        print(v)
    }

    fun toSeconds(time: String?): (Int) -> Int = when (time) {
        "hour" -> { value -> value * 60 * 60 }
        "minute" -> { value -> value * 60 }
        "second" -> { value -> value }
        else -> { value -> value }
    }

    @Test
    fun randomTest() {
        val timeInMinutes = listOf(2, 10, 15, 1)
        val min2sec = toSeconds("minutes")
        val esMultiploDeDos = timeInMinutes.map { it % 2 == 0 }
        print(esMultiploDeDos)

        val totalTimeInSeconds = timeInMinutes.map(min2sec).sum()

        println(listOf(1, 2, 3).fold(0, { x, item -> x + item }))
    }

    @Test
    fun exercise1() {
        val actions = listOf("tittle", "year", "author")
        val prefix = "https://example.com/book-info"
        val id = 5
        val urls = actions.map { x -> "$prefix/$id/$x" }

        println(urls)
    }

    @Test
    fun exercise2() {
        repeatN(5) {
            println("Hello")
        }
    }

    fun repeatN(n: Int, action: () -> Unit) {
        for (i in 1..n) {
            action()
        }
    }

}