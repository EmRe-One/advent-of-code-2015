package de.emreak.adventofcode.days

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Day4Test {

    @Test
    fun part1() {
        assertEquals(609043, Day4.part1("abcdef"), "Day4, Part1 - 1.Example should be 609043.")
        assertEquals(1048970, Day4.part1("pqrstuv"), "Day4, Part1 - 2.Example should be 1048970.")
    }

}