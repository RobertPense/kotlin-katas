package difficulty1

class Difficulty1Katas {
    companion object {
        /**
         * The first century spans from the year 1 up to and including the year 100, The second - from the year 101 up to and including the year 200, etc.
         *
         * Task :
         *   Given a year, return the century it is in.
         */
        fun century(number: Int): Int = when {
            (number <= 0) -> 0
            (number % 100 == 0) -> number / 100
            else -> number / 100 + 1
        }

        /**
         * Very simple, given a number, find its opposite.
         */
        fun opposite(number: Int): Int = -number

        /**
         * Given an array of integers your solution should find the smallest integer.
         *
         * You can assume, for the purpose of this kata, that the supplied array will not be empty.
         */
        fun findSmallestInt(nums: List<Int>): Int {
            return nums.min()!!
        }

        /**
         * In this simple assignment you are given a number and have to make it negative. But maybe the number is already negative?
         *
         * Notes:
         *  The number can be negative already, in which case no change is required.
         *  Zero (0) is not checked for any specific sign. Negative zeros make no mathematical sense.
         */
        fun makeNegative(x: Int): Int {
            return 0
        }

        /**
         * This kata is about multiplying a given number by eight if it is an even number and by nine otherwise.
         */
        fun simpleMultiplication(n: Int): Int {
            return 0
        }

        /**
         * Replace all vowel to exclamation mark in the sentence. aeiouAEIOU is vowel.
         */
        fun replace(s: String): String {
            return ""
        }

        /**
         * Kata Task
         *   I have a cat and a dog.
         *   I got them at the same time as kitten/puppy. That was humanYears years ago.
         *   Return their respective ages now as [humanYears,catYears,dogYears]
         * NOTES:
         *   humanYears >= 1
         *   humanYears are whole numbers only
         * Cat Years
         *   15 cat years for first year
         *   +9 cat years for second year
         *   +4 cat years for each year after that
         * Dog Years
         *   15 dog years for first year
         *   +9 dog years for second year
         *   +5 dog years for each year after that
         */
        fun calculateYears(years: Int): Array<Int> {
            return arrayOf(0, 0, 0);
        }
    }
}