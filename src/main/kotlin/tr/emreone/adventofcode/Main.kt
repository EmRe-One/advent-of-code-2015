package tr.emreone.adventofcode

import tr.emreone.adventofcode.days.*
import tr.emreone.kotlin_utils.Logger.logger
import tr.emreone.kotlin_utils.Resources

fun main() {

    val day = 14

    logger.info { "Day $day: " }

    when (day) {
        1 -> solveDay1()
        2 -> solveDay2()
        3 -> solveDay3()
        4 -> solveDay4()
        5 -> solveDay5()
        6 -> solveDay6()
        7 -> solveDay7()
        8 -> solveDay8()
        9 -> solveDay9()
        10 -> solveDay10()
        11 -> solveDay11()
        12 -> solveDay12()
        13 -> solveDay13()
        14 -> solveDay14()
// $1            
        else -> {
            throw IllegalArgumentException("Day $day is not implemented yet.")
        }
    }
}

fun solveDay1() {
    val input: String = Resources.resourceAsText("day1.txt")

    val solution1 = Day1.part1(input)
    logger.info { "Solution1: $solution1" }

    val solution2 = Day1.part2(input)
    logger.info { "Solution2: $solution2" }
}

fun solveDay2() {
    val input: List<String> = Resources.resourceAsList("day2.txt")

    val solution1 = Day2.part1(input)
    logger.info { "Solution1: $solution1" }

    val solution2 = Day2.part2(input)
    logger.info { "Solution2: $solution2" }
}

fun solveDay3() {
    val input = Resources.resourceAsText("day3.txt")

    val solution1 = Day3.part1(input)
    logger.info { "Solution1: $solution1" }

    val solution2 = Day3.part2(input)
    logger.info { "Solution2: $solution2" }
}

fun solveDay4() {
    val input = Resources.resourceAsText("day4.txt")

    val solution1 = Day4.part1(input)
    logger.info { "Solution1: $solution1" }

    val solution2 = Day4.part2(input)
    logger.info { "Solution2: $solution2" }
}

fun solveDay5() {
    val input = Resources.resourceAsList("day5.txt")

    val solution1 = Day5.part1(input)
    logger.info { "Solution1: $solution1" }

    val solution2 = Day5.part2(input)
    logger.info { "Solution2: $solution2" }
}

fun solveDay6() {
    val input = Resources.resourceAsList("day6.txt")

    val solution1 = Day6.part1(input)
    logger.info { "Solution1: $solution1" }

    val solution2 = Day6.part2(input)
    logger.info { "Solution2: $solution2" }
}

fun solveDay7() {
    val input = Resources.resourceAsList("day7.txt")

    val solution1 = Day7.part1(input)
    logger.info { "Solution1: $solution1" }

    val solution2 = Day7.part2(input)
    logger.info { "Solution2: $solution2" }
}

fun solveDay8() {
    val input = Resources.resourceAsList("day8.txt")

    val solution1 = Day8.part1(input)
    logger.info { "Solution1: $solution1" }

    val solution2 = Day8.part2(input)
    logger.info { "Solution2: $solution2" }
}

fun solveDay9() {
    val input = Resources.resourceAsList("day9.txt")

    val solution1 = Day9.part1(input)
    logger.info { "Solution1: $solution1" }

    val solution2 = Day9.part2(input)
    logger.info { "Solution2: $solution2" }
}

fun solveDay10() {
    val input = Resources.resourceAsText("day10.txt")

    val solution1 = Day10.part1(input)
    logger.info { "Solution1: $solution1" }

    val solution2 = Day10.part2(input)
    logger.info { "Solution2: $solution2" }
}

fun solveDay11() {
    val input = Resources.resourceAsText("day11.txt")

    val solution1 = Day11.part1(input)
    logger.info { "Solution1: $solution1" }

    val solution2 = Day11.part2(input)
    logger.info { "Solution2: $solution2" }
}

fun solveDay12() {
    val input = Resources.resourceAsText("day12.txt")

    val solution1 = Day12.part1(input)
    logger.info { "Solution1: $solution1" }

    val solution2 = Day12.part2(input)
    logger.info { "Solution2: $solution2" }
}

fun solveDay13() {
    val input = Resources.resourceAsList("day13.txt")

    val solution1 = Day13.part1(input)
    logger.info { "Solution1: $solution1" }

    val solution2 = Day13.part2(input)
    logger.info { "Solution2: $solution2" }
}

fun solveDay14() {
    val input = Resources.resourceAsList("day14.txt")

    val solution1 = Day14.part1(input)
    logger.info { "Solution1: $solution1" }

    val solution2 = Day14.part2(input)
    logger.info { "Solution2: $solution2" }
}

// $2
