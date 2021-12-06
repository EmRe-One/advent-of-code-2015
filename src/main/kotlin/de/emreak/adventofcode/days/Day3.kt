package de.emreak.adventofcode.days

object Day3 {

    class Point(var x: Int, var y: Int) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as Point

            if (x != other.x) return false
            if (y != other.y) return false

            return true
        }

        override fun hashCode(): Int {
            var result = x
            result = 31 * result + y
            return result
        }
    }

    fun part1(input: String): Int {
        val housesCoords: MutableSet<Point> = mutableSetOf()
        val currentHouse = Point(0, 0)

        housesCoords.add(Point(currentHouse.x, currentHouse.y))
        for (direction in input) {
            when (direction) {
                '^' -> currentHouse.y++
                '>' -> currentHouse.x++
                'v' -> currentHouse.y--
                '<' -> currentHouse.x--
                else -> throw IllegalArgumentException("Unknown direction: $direction")
            }
            housesCoords.add(Point(currentHouse.x, currentHouse.y))
        }
        return housesCoords.size
    }

    fun part2(input: String): Int {
        val housesCoords: MutableSet<Point> = mutableSetOf()
        val currentSantaHouse = Point(0, 0)
        val currentRoboSantaHouse = Point(0, 0)

        housesCoords.add(Point(currentSantaHouse.x, currentSantaHouse.y))
        input.forEachIndexed { index, direction ->
            if (index % 2 == 0) {
                when (direction) {
                    '^' -> currentSantaHouse.y++
                    '>' -> currentSantaHouse.x++
                    'v' -> currentSantaHouse.y--
                    '<' -> currentSantaHouse.x--
                    else -> throw IllegalArgumentException("Unknown direction: $direction")
                }
                housesCoords.add(Point(currentSantaHouse.x, currentSantaHouse.y))
            }
            else {
                when (direction) {
                    '^' -> currentRoboSantaHouse.y++
                    '>' -> currentRoboSantaHouse.x++
                    'v' -> currentRoboSantaHouse.y--
                    '<' -> currentRoboSantaHouse.x--
                    else -> throw IllegalArgumentException("Unknown direction: $direction")
                }
                housesCoords.add(Point(currentRoboSantaHouse.x, currentRoboSantaHouse.y))
            }
        }
        return housesCoords.size
    }
}
