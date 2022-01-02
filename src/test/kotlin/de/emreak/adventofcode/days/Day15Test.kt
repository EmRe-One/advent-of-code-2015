package de.emreak.adventofcode.days

import tr.emreone.utils.Resources
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Day15Test {

    @Test
    fun part1() {
        val input = Resources.resourceAsList("day15_example.txt")
        assertEquals(-1, Day15.part1(input), "Day15, Part1 should be -1.")
    }

    @Test
    fun part2() {
        val input = Resources.resourceAsList("day15_example.txt")
        assertEquals(-1, Day15.part2(input), "Day15, Part2 should be -1.")
    }

}