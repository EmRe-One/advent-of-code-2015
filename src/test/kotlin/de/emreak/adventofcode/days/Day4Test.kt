package de.emreak.adventofcode.days

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Day4Test {

    @Test
    fun part1() {
        val input = AdventOfCodeUtils.readLines("src/test/resources", "day4_example.txt")
        assertEquals(-1, Day4.part1(input), "Day4, Part1 should be -1.")
    }

    @Test
    fun part2() {
        val input = AdventOfCodeUtils.readLines("src/test/resources", "day4_example.txt")
        assertEquals(-1, Day4.part2(input), "Day4, Part2 should be -1.")
    }

}