package de.emreak.adventofcode.days

object Day15 {

    /**
     *
     * capacity     how well it helps the cookie absorb milk
     * durability   how well it keeps the cookie intact when full of milk
     * flavor       how tasty it makes the cookie
     * texture      how it improves the feel of the cookie
     * calories     how many calories it adds to the cookie
     *
     */
    class Ingredient(
        val name: String, val capacity: Int, val durability: Int, val flavor: Int,
        val texture: Int, val calories: Int
    ) {

        companion object {

            fun parse(line: String): Ingredient {
                val pattern =
                    """^(\w+): capacity (-?\d+), durability (-?\d+), flavor (-?\d+), texture (-?\d+), calories (\d+)""".toRegex()

                val (n, c, d, f, t, cal) = pattern.matchEntire(line)!!.destructured

                return Ingredient(n, c.toInt(), d.toInt(), f.toInt(), t.toInt(), cal.toInt())
            }

        }
    }

    /**
     * ingredients: a, b, c, d, e
     * teaspoon : 100
     *
     * method(100, ingredients, teaspoons) {
     *
     *     for (a in 1..100) {
     *         teaspoons[] = a
     *         a + method(100 - a, ingredients.minus(a))
     *     }
     * }
     *
     */
    fun method(missingTeaspoon: Int, ingredients: List<Ingredient>, teaspoon: MutableMap<String, Int>) {

    }


    fun part1(input: List<String>): Int {
        val ingredients = input.map { Ingredient.parse(it) }
        val allPossibleReceipts = mutableListOf<Ingredient>()

        val ingredientNames = ingredients.map { it.name }.toSet()

        for(a in 1..100) {
            for(b in 1..(100 - a)) {
                for(c in 1..(100 - a - b)) {
                    //
                }
            }
        }
        return 0
    }

    fun part2(input: List<String>): Int {

        return 0
    }

}
