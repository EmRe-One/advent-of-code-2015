package tr.emreone.adventofcode.days

import tr.emreone.utils.Resources
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Day11Test {

    @Test
    fun `test first example part 1`() {
        val input = Resources.resourceAsList("day11_example.txt")
        assertEquals("abcdffaa", Day11.part1(input[0]), "Day11, Part1 - 1.Example should be abcdffaa.")
    }

    @Test
    fun `test second example part 1`() {
        val input = Resources.resourceAsList("day11_example.txt")
        assertEquals("ghjaabcc", Day11.part1(input[1]), "Day11, Part1 - 2.Example should be ghjaabcc.")
    }

}