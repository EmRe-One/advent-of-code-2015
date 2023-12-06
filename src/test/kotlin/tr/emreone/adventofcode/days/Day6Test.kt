package tr.emreone.adventofcode.days

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Day6Test {

    @Test
    fun part1() {
        assertEquals(1_000_000, Day6.part1(listOf("turn on 0,0 through 999,999")), "Day6, Part1 - 1.Example should be 1.000.000.")
        assertEquals(1_000, Day6.part1(listOf("toggle 0,0 through 999,0")), "Day6, Part1 - 2.Example should be 1.000.")
        assertEquals(4, Day6.part1(listOf("turn on 499,499 through 500,500")), "Day6, Part1 - 3.Example should be 4.")
    }

    @Test
    fun part2() {
        assertEquals(1, Day6.part2(listOf("turn on 0,0 through 0,0")), "Day6, Part2 - 1.Example should be 1.")
        assertEquals(2_000_000, Day6.part2(listOf("toggle 0,0 through 999,999")), "Day6, Part2 - 1.Example should be 2.000.000.")
    }

}