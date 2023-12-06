package tr.emreone.adventofcode.days

object Day14 {

    class Reindeer(val name: String, val speed: Int, val flyTime: Int, val restTime: Int) {

        /**
         * |__fly__|______________rest______________||__fly__|______________rest______________|
         * |-----------------------seconds---------------------------|
         *                                           |-----diff------|
         *
         * numberOfCycles = seconds / (flyTime + restTime)
         * diff = seconds - numberOfCycles * (flyTime + restTime)
         *
         * totalFlyTime = numberOfCycles * flyTime + (diff < flyTime ? diff : flyTime)
         */
        fun totalFlyTimeAt(seconds: Int): Int {
            val timeOfOnePeriod = this.flyTime + this.restTime
            val numberOfCycles = seconds / timeOfOnePeriod
            val diff = seconds - numberOfCycles * timeOfOnePeriod

            return numberOfCycles * this.flyTime + (if (diff < this.flyTime) diff else this.flyTime)
        }

        companion object {
            fun parse(line: String): Reindeer {
                val pattern = """^(\w+) can fly (\d+) km/s for (\d+) seconds, but then must rest for (\d+) seconds.""".toRegex()

                val (n, s, f, r) = pattern.matchEntire(line)!!.destructured
                return Reindeer(n, s.toInt(), f.toInt(), r.toInt())
            }

        }
    }

    fun part1(input: List<String>, seconds: Int = 2503): Int {
        val reindeers = input.map { Reindeer.parse(it) }

        return reindeers.maxOf { it.totalFlyTimeAt(seconds) * it.speed }
    }

    fun part2(input: List<String>, seconds: Int = 2503): Int {
        val reindeers = input.map { Reindeer.parse(it) }
        val scoreMap = reindeers.associate { it.name to 0 }.toMutableMap()

        for (second in 1..seconds) {
            val distances = reindeers.associate { it.name to (it.totalFlyTimeAt(second) * it.speed) }
            val leadingDistance = distances.maxOf { it.value }

            distances.filter {
                it.value == leadingDistance
            }.forEach { (name, _) ->
                scoreMap[name] = scoreMap[name]!! + 1
            }
        }
        return scoreMap.maxOf { it.value }
    }

}
