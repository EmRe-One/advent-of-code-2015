package de.emreak.adventofcode.days

object Day10 {

    private fun solve(input: String, repeat: Int): Int {
        var currentString = input

        repeat(repeat) {
            currentString = buildString {
                val length = currentString.length
                var index = 0

                while(index < length) {
                    val currentDigit = currentString[index]
                    var counter = 1
                    index++

                    while(index < length && currentDigit == currentString[index]) {
                        counter++
                        index++
                    }

                    append("$counter$currentDigit")
                }
            }
        }

        return currentString.length
    }

    fun part1(input: String): Int {
        return solve(input, 40)
    }

    fun part2(input: String): Int {
        return solve(input, 50)
    }

}
