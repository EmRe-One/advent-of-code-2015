package tr.emreone.adventofcode.days

import tr.emreone.kotlin_utils.Resources
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Day12Test {

    @Test
    fun `Part 1 - Example 1`() {
        assertEquals(6, Day12.part1("""[1,2,3]"""), "Day12, Part1.1 should be 6.")
        assertEquals(6, Day12.part1("""{"a":2,"b":4}"""), "Day12, Part1.2 should be 6.")
    }

    @Test
    fun `Part 1 - Example 2`() {
        assertEquals(3, Day12.part1("""[[[3]]]"""), "Day12, Part1.3 should be 3.")
        assertEquals(3, Day12.part1("""{"a":{"b":4},"c":-1}"""), "Day12, Part1.4 should be 3.")
    }

    @Test
    fun `Part 1 - Example 3`() {
        assertEquals(0, Day12.part1("""{"a":[-1,1]}"""), "Day12, Part1.5 should be 0.")
        assertEquals(0, Day12.part1("""[-1,{"a":1}]"""), "Day12, Part1.6 should be 0.")
        assertEquals(0, Day12.part1("""[]"""), "Day12, Part1.7 should be 0.")
        assertEquals(0, Day12.part1("""{}"""), "Day12, Part1.8 should be 0.")
    }

    @Test
    fun `Part 2 - Example 1`() {
        assertEquals(6, Day12.part2("""[1,2,3]"""), "Day12, Part2.1 should be 6.")
    }

    @Test
    fun `Part 2 - Example 2`() {
        assertEquals(4, Day12.part2("""[1,{"c":"red","b":2},3]"""), "Day12, Part2.2 should be 4.")
    }

    @Test
    fun `Part 2 - Example 3`() {
        assertEquals(0, Day12.part2("""{"d":"red","e":[1,2,3,4],"f":5}"""), "Day12, Part2.3 should be 0.")
    }

    @Test
    fun `Part 2 - Example 4`() {
        assertEquals(6, Day12.part2("""[1,"red",5]"""), "Day12, Part2.3 should be 6.")
    }

}