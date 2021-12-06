package de.emreak.adventofcode

import AdventOfCodeUtils
import de.emreak.adventofcode.days.*

fun main() {

    val day = 6

    when (day) {
        1 -> solveDay1()
        2 -> solveDay2()
        3 -> solveDay3()
        4 -> solveDay4()
        5 -> solveDay5()
        6 -> solveDay6()
// $1    
        else -> {
            throw IllegalArgumentException("Day $day is not implemented yet.")
        }
    }
}

fun solveDay1() {
    val input: String = AdventOfCodeUtils.readLines(filename = "day1.txt")[0]

    val solution1 = Day1.part1(input)
    println("Solution1: $solution1")

    val solution2 = Day1.part2(input)
    println("Solution2: $solution2")
}

fun solveDay2() {
    val input: List<String> = AdventOfCodeUtils.readLines(filename = "day2.txt")

    val solution1 = Day2.part1(input)
    println("Solution1: $solution1")

    val solution2 = Day2.part2(input)
    println("Solution2: $solution2")
}

fun solveDay3() {
    val input = AdventOfCodeUtils.readLines(filename = "day3.txt")[0]

    val solution1 = Day3.part1(input)
    println("Solution1: $solution1")

    val solution2 = Day3.part2(input)
    println("Solution2: $solution2")
}

fun solveDay4() {
    val input = AdventOfCodeUtils.readLines(filename = "day4.txt")[0]

    val solution1 = Day4.part1(input)
    println("Solution1: $solution1")

    val solution2 = Day4.part2(input)
    println("Solution2: $solution2")
}

fun solveDay5() {
    val input = AdventOfCodeUtils.readLines(filename = "day5.txt")

    val solution1 = Day5.part1(input)
    println("Solution1: $solution1")

    val solution2 = Day5.part2(input)
    println("Solution2: $solution2")
}

fun solveDay6() {
    val input = AdventOfCodeUtils.readLines(filename = "day6.txt")

    val solution1 = Day6.part1(input)
    println("Solution1: $solution1")

    val solution2 = Day6.part2(input)
    println("Solution2: $solution2")
}

// $2
