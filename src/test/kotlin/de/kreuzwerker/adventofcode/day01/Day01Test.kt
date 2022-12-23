package de.kreuzwerker.adventofcode.day01

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day01Test {

    @Test
    fun `day01`() {
        val d1 = Day_01()

        var given =
"""1000
2000
3000

4000

5000
6000

7000
8000
9000

10000"""
        val actual = d1.solve(given)

        Assertions.assertEquals(24000, actual)
    }

    @Test
    fun execute() {
        val d1 = Day_01()
        println(d1.solvePart2(Day_01.input))
    }
}