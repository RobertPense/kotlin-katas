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
    }
}