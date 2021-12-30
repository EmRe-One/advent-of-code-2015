package de.emreak.adventofcode.days

object Day1 {

    fun part1(input: String): Int {
        val groups = input.groupBy { it }
        return (groups['(']?.size ?: 0) - (groups[')']?.size ?: 0)
    }

    fun part2(input: String): Int {
        var position = 0
        var floor = 0

        while(position < input.length) {
            if (input[position] == '(') {
                floor++
            }
            else {
                floor--
            }

            if (floor == -1) {
                return position + 1
            }
            else {
                position++
            }
        }

        return -1
    }

}
