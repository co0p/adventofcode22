package de.kreuzwerker.adventofcode.day02

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class day02Test {

    @Test
    fun test() {

        val given =
"""A Y
B X
C Z"""

        val day02 = Day02()
        val actual = day02.solve(given)

        assertEquals(15, actual)
    }
    @Test
    fun solve() {
        val day02 = Day02()
        val actual = day02.solve(Day02.input)
        println(actual)
    }
}