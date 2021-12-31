package de.emreak.adventofcode.days

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import tr.emreone.utils.Resources

internal class Day5Test {

    @Test
    fun part1() {
        val input = Resources.resourceAsList("day5_1example.txt")
        assertEquals(2, Day5.part1(input), "Day5, Part1 should be 2.")
    }

    @Test
    fun part2() {
        val input = Resources.resourceAsList("day5_2example.txt")
        assertEquals(2, Day5.part2(input), "Day5, Part2 should be 2.")
    }

}