package difficulty3

// TODO Continue adding Katas here

class Difficulty3Katas {
    companion object {
        /**
         * Backwards Read Primes are primes that when read backwards in base 10 (from right to left) are a different prime. (This rules out primes which are palindromes.)
         * Examples:
         *   13 17 31 37 71 73 are Backwards Read Primes
         *   13 is such because it's prime and read from right to left writes 31 which is prime too. Same for the others.
         * Task
         *   Find all Backwards Read Primes between two positive given numbers (both inclusive), the second one always being greater than or equal to the first one. The resulting array or the resulting string will be ordered following the natural order of the prime numbers.
         * Example
         *   backwardsPrime(2, 100) => [13, 17, 31, 37, 71, 73, 79, 97] backwardsPrime(9900, 10000) => [9923, 9931, 9941, 9967] backwardsPrime(501, 599) => []
         */
        fun backwardsPrime(start:Long, end:Long) : String {
            return ""
        }

        /**
         * A child is playing with a ball on the nth floor of a tall building. The height of this floor, h, is known.
         *
         * He drops the ball out of the window. The ball bounces (for example), to two-thirds of its height (a bounce of 0.66).
         *
         * His mother looks out of a window 1.5 meters from the ground.
         *
         * How many times will the mother see the ball pass in front of her window (including when it's falling and bouncing?
         *
         * Three conditions must be met for a valid experiment:
         *   Float parameter "h" in meters must be greater than 0
         *   Float parameter "bounce" must be greater than 0 and less than 1
         *   Float parameter "window" must be less than h.
         * If all three conditions above are fulfilled, return a positive integer, otherwise return -1.
         *
         * Note: The ball can only be seen if the height of the rebounding ball is stricty greater than the window parameter.
         *
         * Example:
         *
         *   h = 3, bounce = 0.66, window = 1.5, result is 3
         *
         *   h = 3, bounce = 1, window = 1.5, result is -1 (Condition 2) not fulfilled).
         */
        fun bouncingBall(h:Double, bounce:Double, window:Double) : Int {
            return 0
        }

        /**
         * Two tortoises named A and B must run a race. A starts with an average speed of 720 feet per hour. Young B knows she runs faster than A, and furthermore has not finished her cabbage.
         *
         * When she starts, at last, she can see that A has a 70 feet lead but B's speed is 850 feet per hour. How long will it take B to catch A?
         *
         * More generally: given two speeds v1 (A's speed, integer > 0) and v2 (B's speed, integer > 0) and a lead g (integer > 0) how long will it take B to catch A?
         *
         * The result will be an array [hour, min, sec] which is the time needed in hours, minutes and seconds (round down to the nearest second) or a string in some languages.
         *
         * If v1 >= v2 then return nil, nothing, null, None or {-1, -1, -1} for C++, C, Go, Nim, [] for Kotlin or "-1 -1 -1".
         *
         * Examples:
         *
         * race(720, 850, 70) => [0, 32, 18] or "0 32 18"
         * race(80, 91, 37)   => [3, 21, 49] or "3 21 49"
         */
        fun race(v1:Int, v2:Int, g:Int) : IntArray {
            return intArrayOf(0)
        }

        /**
         * We are still with squared integers.
         * Given 4 integers a, b, c, d we form the sum of the squares of a and b and then the sum of the squares of c and d. We multiply the two sums hence a number n and we try to decompose n in a sum of two squares e and f (e and f integers >= 0) so that n = e² + f².
         *
         * More: e and f must result only from sums (or differences) of products between on the one hand (a, b) and on the other (c, d) each of a, b, c, d taken only once.
         *
         * Suppose we have a = 1, b = 2, c = 1, d = 3. First we calculate the sums 1² + 2² = 5 and 1² + 3² = 10 hence n = 50.
         *
         * 50 = 1² + 7² or 50 = 7² + 1² (we'll consider that these two solutions are the same) or 50 = 5² + 5².
         *
         * The return of our function will be an array of subarrays (in C an array of Pairs) sorted on the first elements of the subarrays. In each subarray the lower element should be the first.
         *
         * prod2sum(1, 2, 1, 3) should return [[1, 7], [5, 5]]
         * prod2sum(2, 3, 4, 5) should return [[2, 23], [7, 22]]
         *
         * because (2² + 3²) * (4² + 5²) = 533 = (7² + 22²) = (23² + 2²)
         *
         * prod2sum(1, 2, 2, 3) should return [[1, 8], [4, 7]]
         *
         * prod2sum(1, 1, 3, 5) should return [[2, 8]] (there are not always 2 solutions).
         *
         * Hint Take a sheet of paper and with a bit of algebra try to write the product of squared numbers in another way.
         */
        fun prod2Sum(a:Long, b:Long, c:Long, d:Long):List<LongArray> {
            return listOf(longArrayOf(0))
        }

    }
}