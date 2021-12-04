package de.emreak.adventofcode.days

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


internal class Day1Test {

    @Test
    fun part1() {
        assertEquals(0, Day1.part1("(())"), "Day 1, Part 1 - 1. Example should be 0.")
        assertEquals(0, Day1.part1("()()"), "Day 1, Part 1 - 2. Example should be 0.")
        assertEquals(3, Day1.part1("((("), "Day 1, Part 1 - 3. Example should be 3.")
        assertEquals(3, Day1.part1("(()(()("), "Day 1, Part 1 - 4. Example should be 3.")
        assertEquals(3, Day1.part1("))((((("), "Day 1, Part 1 - 5. Example should be 3.")
        assertEquals(-1, Day1.part1("())"), "Day 1, Part 1 - 6. Example should be -1.")
        assertEquals(-1, Day1.part1("))("), "Day 1, Part 1 - 7. Example should be -1.")
        assertEquals(-3, Day1.part1(")))"), "Day 1, Part 1 - 8. Example should be -3.")
        assertEquals(-3, Day1.part1(")())())"), "Day 1, Part 1 - 9. Example should be -3.")
    }

    @Test
    fun part2() {
        assertEquals(1, Day1.part2(")"), "Day 1, Part 2 - 1.Example should be 1.")
        assertEquals(5, Day1.part2("()())"), "Day 1, Part 2 - 2.Example should be 5.")
    }

}