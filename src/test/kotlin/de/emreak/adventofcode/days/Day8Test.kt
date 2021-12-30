package de.emreak.adventofcode.days

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import tr.emreone.utils.FileLoader

internal class Day8Test {

    @Test
    fun part1() {
        val input = FileLoader.readLines("src/test/resources", "day8_example.txt")
        val result = 23 - 11
        assertEquals(result, Day8.part1(input), "Day8, Part1 should be 12.")
    }

    @Test
    fun part2() {
        val input = FileLoader.readLines("src/test/resources", "day8_example.txt")
        assertEquals(19, Day8.part2(input), "Day8, Part2 should be 19.")
    }

}