package de.emreak.adventofcode.days

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Day3Test {

    @Test
    fun part1() {
        assertEquals(2, Day3.part1(">"), "Day3, Part1 - 1.Example should be 2.")
        assertEquals(4, Day3.part1("^>v<"), "Day3, Part1 - 2.Example should be 4.")
        assertEquals(2, Day3.part1("^v^v^v^v^v"), "Day3, Part1 - 3.Example should be 2.")
    }

    @Test
    fun part2() {
        assertEquals(-1, Day3.part2(""), "Day3, Part2 should be -1.")
    }

}