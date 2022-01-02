package de.emreak.adventofcode.days

import tr.emreone.utils.Resources
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Day13Test {

    @Test
    fun part1() {
        val input = Resources.resourceAsList("day13_example.txt")
        assertEquals(330, Day13.part1(input), "Day13, Part1 should be 330.")
    }

    @Test
    fun part2() {
        val input = Resources.resourceAsList("day13_example.txt")
        assertEquals(286, Day13.part2(input), "Day13, Part2 should be -1.")
    }

}