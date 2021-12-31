package de.emreak.adventofcode.days

import kotlinx.serialization.json.*

object Day12 {

    private fun sumInJsonElement(element: JsonElement, filterReds: Boolean = false): Int {
        var sum = 0

        if (element is JsonObject) {
            if (filterReds && element.values.contains(JsonPrimitive("red"))) {
                return 0
            }

            element.entries.forEach { (_, element) ->
                sum += sumInJsonElement(element, filterReds)
            }
        }
        else if (element is JsonArray) {
            element.forEach { item ->
                sum += sumInJsonElement(item, filterReds)
            }
        }
        else if (element is JsonPrimitive && element.intOrNull != null) {
            sum += element.int
        }

        return sum
    }

    /*private fun sumInJsonObject(jsonObject: JsonObject, filterReds: Boolean = false): Int {
        var sum = 0
        if (filterReds && jsonObject.contains("red")) {
            return 0
        }

        for((_, value) in jsonObject.entries) {
            if (value is JsonObject) {
                sum += sumInJsonElement(value, filterReds)
            }
            else if (value is JsonArray) {
                sum += sumInJsonElement(value, filterReds)
            }
            else if (value is JsonPrimitive && value.intOrNull != null) {
                sum += value.int
            }
        }

        return sum
    }

    private fun sumInJsonArray(jsonArray: JsonArray, filterReds: Boolean = false): Int {
        var sum = 0
        for(element in jsonArray) {
            if (element is JsonObject) {
                sum += sumInJsonElement(element, filterReds)
            }
            else if (element is JsonArray) {
                sum += sumInJsonElement(element, filterReds)
            }
            else if (element is JsonPrimitive && element.intOrNull != null) {
                sum += element.int
            }
        }

        return sum
    }
*/
    fun part1(input: String): Int {
        val json = Json
        val deserializedToTree: JsonElement = json.parseToJsonElement(input)

        return sumInJsonElement(deserializedToTree)
    }


    fun part2(input: String): Int {
        val json = Json
        val deserializedToTree: JsonElement = json.parseToJsonElement(input)

        return sumInJsonElement(deserializedToTree, true)
    }

}
