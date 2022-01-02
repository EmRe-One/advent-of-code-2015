package de.emreak.adventofcode.days

import tr.emreone.utils.Resources
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Day14Test {

    @Test
    fun part1() {
        val input = Resources.resourceAsList("day14_example.txt")
        assertEquals(1120, Day14.part1(input, 1000), "Day14, Part1 should be 1120.")
    }

    @Test
    fun part2() {
        val input = Resources.resourceAsList("day14_example.txt")
        assertEquals(689, Day14.part2(input, 1000), "Day14, Part2 should be 689.")
    }

}