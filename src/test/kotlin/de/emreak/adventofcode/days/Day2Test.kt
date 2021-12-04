package de.emreak.adventofcode.days

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class Day2Test {

    @Test
    fun part1() {
        assertEquals(58, Day2.part1(listOf("2x3x4")), "Day2, Part 1 - 1. Example should be 58.")
        assertEquals(43, Day2.part1(listOf("1x1x10")), "Day2, Part 1 - 2. Example should be 43.")
    }

    @Test
    fun part2() {
        assertEquals(34, Day2.part2(listOf("2x3x4")), "Day2, Part 2 - 1. Example should be 34.")
        assertEquals(14, Day2.part2(listOf("1x1x10")), "Day2, Part 2 - 2. Example should be 14.")
    }

}
