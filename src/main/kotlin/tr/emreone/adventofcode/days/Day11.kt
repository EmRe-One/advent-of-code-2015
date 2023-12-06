package tr.emreone.adventofcode.days

object Day11 {

    class Password(var password: String) {

        fun incrementPassword() {
            val length = password.length
            var index = length - 1

            while (index >= 0) {
                val c = password[index]
                if (c == 'z') {
                    password = password.substring(0, index) + 'a' + password.substring(index + 1)
                }
                else {
                    password = password.substring(0, index) + (c + 1) + password.substring(index + 1)
                    break
                }
                index--
            }
        }

        private fun isValid(): Boolean {
            // check first:
            // Passwords may not contain the letters i, o, or l,
            // as these letters can be mistaken for other characters and are therefore confusing.
            if (this.password.contains("""(i|o|l)""".toRegex())) {
                return false
            }

            // check second:
            // Passwords must contain at least two different, non-overlapping pairs of letters,
            // like aa, bb, or zz.
            val pairs = this.password
                .windowed(2) { "${it[0]}${it[1]}" }
                .filter { it[0] == it[1] }
                .groupBy { it }
            if (pairs.size < 2) {
                return false
            }

            // check third:
            // Passwords must include one increasing straight of at least three letters,
            // like abc, bcd, cde, and so on, up to xyz. They cannot skip letters; abd doesn't count.
            val triple = this.password
                .windowed(3)
                .count {
                    (it[0] <= 'x') && (it[0] + 1 == it[1]) && (it[1] + 1 == it[2])
                }
            if (triple == 0) {
                return false
            }

            return true
        }

        fun findNextValidPassword() {
            while(!isValid()) {
                incrementPassword()
            }
        }
    }

    fun part1(input: String): String {
        val pw = Password(input)
        pw.findNextValidPassword()
        return pw.password
    }

    fun part2(input: String): String {
        val pw = Password(input)
        pw.findNextValidPassword()
        pw.incrementPassword()
        pw.findNextValidPassword()
        return pw.password
    }

}
