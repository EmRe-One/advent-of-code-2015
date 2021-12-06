package de.emreak.adventofcode.days

import kotlin.math.max

object Day6 {

    enum class Command {
        ON,
        OFF,
        TOGGLE
    }

    data class Instruction(
        val command: Command,
        val x: Int,
        val y: Int,
        val width: Int,
        val height: Int
    )

    fun part1(input: List<String>): Int {
        val regex = """^(turn on|turn off|toggle) (\d+),(\d+) through (\d+),(\d+)$""".toRegex()
        val lightsGrid = Array(1000) { IntArray(1000) { 0 } }

        input.forEach {
            val (command, x1, y1, x2, y2) = regex.matchEntire(it)!!.destructured
            val commandValue = when (command) {
                "turn on"  -> Command.ON
                "turn off" -> Command.OFF
                "toggle"   -> Command.TOGGLE
                else -> throw IllegalArgumentException("Unknown command: $command")
            }

            for (x in x1.toInt()..x2.toInt()) {
                for (y in y1.toInt()..y2.toInt()) {
                    when(commandValue) {
                        Command.ON     -> lightsGrid[x][y] = 1
                        Command.OFF    -> lightsGrid[x][y] = 0
                        Command.TOGGLE -> lightsGrid[x][y] = (lightsGrid[x][y] + 1) % 2
                    }
                }
            }
        }

        return lightsGrid.sumOf { line ->
            line.sum()
        }
    }

    fun part2(input: List<String>): Int {
        val regex = """^(turn on|turn off|toggle) (\d+),(\d+) through (\d+),(\d+)$""".toRegex()
        val lightsGrid = Array(1000) { IntArray(1000) { 0 } }

        input.forEach {
            val (command, x1, y1, x2, y2) = regex.matchEntire(it)!!.destructured
            val commandValue = when (command) {
                "turn on"  -> +1
                "turn off" -> -1
                "toggle"   -> +2
                else -> throw IllegalArgumentException("Unknown command: $command")
            }

            for (x in x1.toInt()..x2.toInt()) {
                for (y in y1.toInt()..y2.toInt()) {
                    lightsGrid[x][y] = max(0, lightsGrid[x][y] + commandValue)
                }
            }
        }

        return lightsGrid.sumOf { line ->
            line.sum()
        }
    }

}
