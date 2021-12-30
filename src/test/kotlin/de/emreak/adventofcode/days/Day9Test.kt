package de.emreak.adventofcode.days

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import tr.emreone.utils.FileLoader
import tr.emreone.utils.Resources

internal class Day9Test {

    @Test
    fun `test example part 1`() {
        val input = Resources.resourceAsList("day9_example.txt")
        assertEquals(605, Day9.part1(input), "Day9, Part1 should be 605.")
    }

    @Test
    fun `test example part 2`() {
        val input = FileLoader.readLines("src/test/resources", "day9_example.txt")
        assertEquals(982, Day9.part2(input), "Day9, Part2 should be 982.")
    }

}