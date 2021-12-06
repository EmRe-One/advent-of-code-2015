package de.emreak.adventofcode.days

import java.math.BigInteger

object Day4 {

    fun md5(input: String): String {
        val md = java.security.MessageDigest.getInstance("MD5")
        val digest = md.digest(input.toByteArray())
        val hexString = BigInteger(1, digest).toString(16)
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
