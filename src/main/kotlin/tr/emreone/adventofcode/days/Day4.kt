package tr.emreone.adventofcode.days

import tr.emreone.kotlin_utils.extensions.md5

object Day4 {

    private fun md5(input: String): String {
        val hexString = input.md5()
        return hexString.padStart(32, '0')
    }

    fun part1(secretKey: String): Int {
        var number = 346385

        while(true){
            val hash = md5("$secretKey$number")

            if(hash.startsWith("00000")){
                return number
            }
            number++
        }
    }

    fun part2(secretKey: String): Int {
        var number = 0

        while(true){
            val hash = md5("$secretKey$number")

            if(hash.startsWith("000000")){
                return number
            }
            number++
        }
    }

}
