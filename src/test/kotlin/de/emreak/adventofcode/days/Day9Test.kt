package de.emreak.adventofcode.days

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import tr.emreone.utils.FileLoader

internal class Day9Test {

    @Test
    fun part1() {
        val input = FileLoader.readLines("src/test/resources", "day9_example.txt")
        assertEquals(-1, Day9.part1(input), "Day9, Part1 should be -1.")
    }

    @Test
    fun part2() {
        val input = FileLoader.readLines("src/test/resources", "day9_example.txt")
        assertEquals(-1, Day9.part2(input), "Day9, Part2 should be -1.")
    }

}