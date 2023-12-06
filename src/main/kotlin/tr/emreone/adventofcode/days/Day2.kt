package tr.emreone.adventofcode.days

object Day2 {

    fun part1(input: List<String>): Int {
        val regex = """^(?<length>\d+)x(?<width>\d+)x(?<height>\d+)$""".toRegex()

        return input.sumOf { line ->
            val (l, w, h) = regex.find(line)?.destructured!!
            val side1 = l.toInt() * w.toInt()
            val side2 = w.toInt() * h.toInt()
            val side3 = h.toInt() * l.toInt()

            2 * side1 + 2 * side2 + 2 * side3 + minOf(side1, side2, side3)
        }
    }

    fun part2(input: List<String>): Int {
        val regex = """^(?<length>\d+)x(?<width>\d+)x(?<height>\d+)$""".toRegex()

        return input.sumOf { line ->
            val (l, w, h) = regex.find(line)?.destructured!!
            val lengths = listOf(l.toInt(), w.toInt(), h.toInt()).sorted()

            val wrapRibbon = 2 * lengths[0] + 2 * lengths[1]
            val bowRibbon = lengths[0] * lengths[1] * lengths[2]

            wrapRibbon + bowRibbon
        }
    }

}
