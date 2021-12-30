package de.emreak.adventofcode.days

object Day10 {

    fun part1(input: String, repeat: Int = 40): String {
        var currentString = input

        repeat(repeat) {
            currentString = buildString {
                var index = 0
            }
        }

        return currentString
    }

    fun part2(input: String): String {

        return "0"
    }

}
