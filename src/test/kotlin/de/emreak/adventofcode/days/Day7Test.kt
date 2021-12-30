package de.emreak.adventofcode.days

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import tr.emreone.utils.FileLoader

internal class Day7Test {

    @Test
    fun part1() {
        val input = FileLoader.readLines("src/test/resources", "day7_example.txt")
        val variables = Day7.parseVariables(input)

        assertEquals(72.toUShort(), variables["d"], "Day7, Part1 - d should be 72.")
        assertEquals(507.toUShort(), variables["e"], "Day7, Part1 - e should be 507.")
        assertEquals(492.toUShort(), variables["f"], "Day7, Part1 - f should be 492.")
        assertEquals(114.toUShort(), variables["g"], "Day7, Part1 - g should be 114.")
        assertEquals(65412.toUShort(), variables["h"], "Day7, Part1 - h should be 65412.")
        assertEquals(65079.toUShort(), variables["i"], "Day7, Part1 - i should be 65079.")
        assertEquals(123.toUShort(), variables["x"], "Day7, Part1 - x should be 123.")
        assertEquals(456.toUShort(), variables["y"], "Day7, Part1 - y should be 456.")
    }

}