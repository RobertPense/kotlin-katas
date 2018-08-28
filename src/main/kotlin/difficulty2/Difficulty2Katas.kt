package difficulty2

import java.math.BigInteger

class Difficulty2Katas {
    companion object {
        /**
         * Two red beads are placed between every two blue beads. There are N blue beads. After looking at the arrangement below work out the number of red beads.
         */
        fun countRedBeads(nBlue: Int): Int {
            return nBlue
        }

        /**
         * Mathematical:
         *
         * Professor Chambouliard has just completed an experiment on gravitational waves. He measures their effects on small magnetic particles. This effect is very small and negative; it satisfies the equation:
         *
         * f(x) = x**2 + 1e9 * x + 1 = 0.
         *
         * Professor C. knows how to solve equations of the form
         *
         * g(x) = a x ** 2 + b x + c = 0 (1)
         *
         * using the "discriminant". As soon as he thinks, as soon as he does.
         *
         * It finds that the roots of x**2 + 1e9 * x + 1 = 0 are x1 = -1e9 and x2 = 0. The value of x1 - good or bad - does not interest him because its absolute value is too big.
         *
         * On the other hand, he sees immediately that the value of x2 is not suitable! He asks our help to solve equations of type (1) with a, b, c strictly positive numbers, and b being large (b >= 10 ** 9).
         *
         * Professor C. will check your result x2 (the smaller root in absolute value. Don't return the other root!) by reporting x2 in (1) and seeing if abs(g(x2)) < 1e-12.
         *
         * Task:
         * solve(a, b, c)
         *
         * that will return the "solution" x2 of (1) such as abs(a * x2 ** 2 + b * x2 + c) < 1e-12.
         *
         * Example:
         * for equation 7*x**2 + 0.40E+14 * x + 8 = 0 we can find: x2 = -2e-13 which verifies abs(g(x)) < 1e-12.
         */
        fun quadratic(a:Double, b:Double, c:Double):Double {
            return 0.0
        }

        /**
         * You are given two arrays a1 and a2 of strings. Each string is composed with letters from a to z. Let x be any string in the first array and y be any string in the second array.
         *
         * Find max(abs(length(x) − length(y)))
         *
         * If a1 and/or a2 are empty return -1
         *
         * s1 = ["hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"]
         * s2 = ["cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"]
         * mxdiflg(s1, s2) --> 13
         *
         * input : 2 strings with substrings separated by ,
         */
        fun mxdiflg(a1:Array<String>, a2:Array<String>):Int {
            return 0
        }

        /**
         * You have an amount of money a0 > 0 and you deposit it with a constant interest rate of p% > 0 per year on the 1st of January 2016. You want to have an amount a >= a0.
         *
         * Task: The function date_nb_days (or dateNbDays...) with parameters a0, a, p will return, as a string, the date on which you have just reached a.
         *
         * Example: date_nb_days(100, 101, 0.98) --> "2017-01-01" (366 days)
         * date_nb_days(100, 150, 2.00) --> "2035-12-26" (7299 days)
         *
         * Notes:
         *   The return format of the date is "YYYY-MM-DD"
         *   The deposit is always on the "2016-01-01"
         *   If p% is the rate for a year the rate for a day is p divided by 36000 since banks consider that there are 360 days in a year.
         *   You have: a0 > 0, p% > 0, a >= a0
         */
        fun dateNbDays(a0:Double, a:Double, p:Double):String {
            return ""
        }

        /**
         * My grandfather always predicted how old people would get, and right before he passed away he revealed his secret!
         * In honor of my grandfather's memory we will write a function using his formula!
         *   Take a list of ages when each of your great-grandparent died.
         *   Multiply each number by itself.
         *   Add them all together.
         *   Take the square root of the result.
         *   Divide by two.
         *
         * Example:
         *   predictAge(65, 60, 75, 55, 60, 63, 64, 45) === 86
         *
         * Note:
         *   the result should be rounded down to the nearest integer.
         */
        fun predictAge(age1: Int, age2: Int, age3: Int, age4: Int, age5: Int, age6: Int, age7: Int, age8: Int): Int{
            return 0
        }

        /**
         * In a small town the population is p0 = 1000 at the beginning of a year. The population regularly increases by 2 percent per year and moreover 50 new inhabitants per year come to live in the town. How many years does the town need to see its population greater or equal to p = 1200 inhabitants?
         * At the end of the first year there will be:
         * 1000 + 1000 * 0.02 + 50 => 1070 inhabitants
         * At the end of the 2nd year there will be:
         * 1070 + 1070 * 0.02 + 50 => 1141 inhabitants (number of inhabitants is an integer)
         * At the end of the 3rd year there will be:
         * 1141 + 1141 * 0.02 + 50 => 1213
         * It will need 3 entire years.
         * More generally given parameters:
         * p0, percent, aug (inhabitants coming or leaving each year), p (population to surpass)
         * the function nb_year should return n number of entire years needed to get a population greater or equal to p.
         * aug is an integer, percent a positive or null number, p0 and p are positive integers (> 0)
         * Examples:
         *   nb_year(1500, 5, 100, 5000) -> 15
         *   nb_year(1500000, 2.5, 10000, 2000000) -> 10
         * Note:
         *   Don't forget to convert the percent parameter as a percentage in the body of your function: if the parameter percent is 2 you have to convert it to 0.02.
         */
        fun nbYear(pp0:Int, percent:Double, aug:Int, p:Int):Int {
            return 0
        }

        /**
         * All we eat is water and dry matter.
         * John bought potatoes: their weight is 100 kilograms. Potatoes contain water and dry matter.
         * The water content is 99 percent of the total weight. He thinks they are too wet and puts them in an oven - at low temperature - for them to lose some water.
         * At the output the water content is only 98%.
         * What is the total weight in kilograms (water content plus dry matter) coming out of the oven?
         * He finds 50 kilograms and he thinks he made a mistake: "So much weight lost for such a small change in water content!"
         * Can you help him?
         * Write function potatoes with
         * int parameter p0 - initial percent of water-
         * int parameter w0 - initial weight -
         * int parameter p1 - final percent of water -
         * potatoesshould return the final weight coming out of the oven w1 truncated as an int.
         * Example:
         *   potatoes(99, 100, 98) --> 50
         */
        fun potatoes(p0:Int, w0:Int, p1:Int):Int {
            return 0
        }

        /**
         * Take an integer n (n >= 0) and a digit d (0 <= d <= 9) as an integer. Square all numbers k (0 <= k <= n) between 0 and n. Count the numbers of digits d used in the writing of all the k**2. Call nb_dig (or nbDig or ...) the function taking n and d as parameters and returning this count.
         * Examples:
         *   n = 10, d = 1, the k*k are 0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100
         *   We are using the digit 1 in 1, 16, 81, 100. The total count is then 4.
         *   nb_dig(25, 1):
         *   the numbers of interest are
         *   1, 4, 9, 10, 11, 12, 13, 14, 19, 21 which squared are 1, 16, 81, 100, 121, 144, 169, 196, 361, 441
         *   so there are 11 digits `1` for the squares of numbers between 0 and 25.
         * Note that 121 has twice the digit 1.
         */
        fun nbDig(n:Int, d:Int):Int {
            return 0
        }

        /**
         * John wants to decorate a room with wallpaper. He has been said that making sure he has the right amount of wallpaper is more complex than it sounds. He wants a fool-proof method to getting it right.
         * John knows that the rectangular room has a length of l meters, a width of w meters, a height of h meters. The standard width of the rolls he wants to buy is 52 centimeters. The length of a roll is 10 meters. He bears in mind however, that it’s best to have an extra length of wallpaper handy in case of mistakes or miscalculations so he wants to buy a length 15% greater than the one he needs.
         * Last time he did these calculations he caught a headache so could you help John? Your function wallpaper(l, w, h) should return as a plain English word in lower case the number of rolls he must buy.
         * Example:
         *   wallpaper(4, 3.5, 3) should return "ten"
         * Notes:
         *   all rolls (even with incomplete width) are put edge to edge
         *   0 <= l, w, h (floating numbers), it can happens that w x h x l is zero
         *   the integer r (number of rolls) will always be less or equal to 20
         */
        fun wallpaper(l:Double, w:Double, h:Double):String {
            return ""
        }

        /**
         * Create a Circular List
         * A circular list is of finite size, but can infititely be asked for its previous and next elements. This is because it acts like it is joined at the ends and loops around.
         * For example, imagine a CircularList of [1, 2, 3, 4]. Five invocations of next() in a row should return 1, 2, 3, 4 and then 1 again. At this point, five invocations of prev() in a row should return 4, 3, 2, 1 and then 4 again.
         * Your CircularList is created by passing a vargargs parameter in, e.g. new CircularList(1, 2, 3). Your list constructor/init code should throw an Exception if nothing is passed in.
         */
        class CircularList<T>(vararg val elements: T) {
            fun next(): T {
                return 0 as T
            }

            fun prev(): T {
                return 0 as T
            }
        }

        /**
         * Input:
         *   a string strng
         *   an array of strings arr
         * Output of function contain_all_rots(strng, arr) (or containAllRots or contain-all-rots):
         *   a boolean true if all rotations of strng are included in arr (C returns 1)
         *   false otherwise (C returns 0)
         * Examples:
         * contain_all_rots("bsjq", ["bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs"]) -> true
         * contain_all_rots("Ajylvpy", ["Ajylvpy", "ylvpyAj", "jylvpyA", "lvpyAjy", "pyAjylv", "vpyAjyl", "ipywee"]) -> false)
         * Note:
         * Though not correct in a mathematical sense
         *   we will consider that there are no rotations of strng == ""
         *   and for any array arr: contain_all_rots("", arr) --> true
         * Ref: https://en.wikipedia.org/wiki/String_(computer_science)#Rotations
         */
        fun containAllRots(strng:String, arr:ArrayList<String>):Boolean {
            return false
        }

        /**
         * My friend John likes to go to the cinema. He can choose between system A and system B.
         *   System A : buy a ticket (15 dollars) every time
         *   System B : buy a card (500 dollars) and every time
         *     buy a ticket the price of which is 0.90 times the price he paid for the previous one.
         * Example: If John goes to the cinema 3 times:
         *   System A : 15 * 3 = 45
         *   System B : 500 + 15 * 0.90 + (15 * 0.90) * 0.90 + (15 * 0.90 * 0.90) * 0.90 ( = 536.5849999999999, no rounding for each ticket)
         * John wants to know how many times he must go to the cinema so that the final result of System B, when rounded up to the next dollar, will be cheaper than System A.
         * The function movie has 3 parameters: card (price of the card), ticket (normal price of a ticket), perc (fraction of what he paid for the previous ticket) and returns the first n such that
         *   ceil(price of System B) < price of System A.
         * More examples:
         *   movie(500, 15, 0.9) should return 43
         *     (with card the total price is 634, with tickets 645)
         *   movie(100, 10, 0.95) should return 24
         *     (with card the total price is 235, with tickets 240)
         */
        fun movie(card:Int, ticket:Int, perc:Double):Int {
            return 0
        }

        /**
         * You are going to be given a word. Your job is to return the middle character of the word. If the word's length is odd, return the middle character. If the word's length is even, return the middle 2 characters.
         * Examples:
         *   Kata.getMiddle("test") should return "es"
         *   Kata.getMiddle("testing") should return "t"
         *   Kata.getMiddle("middle") should return "dd"
         *   Kata.getMiddle("A") should return "A"
         * Input
         *   A word (string) of length 0 < str < 1000. You do not need to test for this. This is only here to tell you that you do not need to worry about your solution timing out.
         * Output
         *   The middle character(s) of the word represented as a string.
         */
        fun middleCharacter(word : String) : String {
            return ""
        }

        /**
         * One of the first algorithm used for approximating the integer square root of a positive integer n is known as "Hero's method", named after the first-century Greek mathematician Hero of Alexandria who gave the first description of the method. Hero's method can be obtained from Newton's method which came 16 centuries after.
         * We approximate the square root of a number n by taking an initial guess x, an error e and repeatedly calculating a new approximate integer value x using: (x + n / x) / 2; we are finished when the previous x and the new x have an absolute difference less than e.
         * We supply to a function (int_rac) a number n (positive integer) and a parameter guess (positive integer) which will be our initial x. For this kata the parameter 'e' is set to 1.
         * Hero's algorithm is not always going to come to an exactly correct result! For instance: if n = 25 we get 5 but for n = 26 we also get 5. Nevertheless 5 is the integer square root of 26.
         * The kata is to return the count of the progression of integer approximations that the algorithm makes.
         * Reference:
         *   https://en.wikipedia.org/wiki/Methods_of_computing_square_roots#Babylonian_method
         * Some examples:
         *   int_rac(25,1): follows a progression of [1,13,7,5] so our function should return 4.
         *   int_rac(125348,300): has a progression of [300,358,354] so our function should return 3.
         *   int_rac(125348981764,356243): has a progression of [356243,354053,354046] so our function should return 3.
         * You can use Math.floor (or similar) for each integer approximation.
         */
        fun intRac(n:Long, guess:Long) : Long {
            return 0
        }

        /**
         * A number m of the form 10x + y is divisible by 7 if and only if x − 2y is divisible by 7. In other words, subtract twice the last digit from the number formed by the remaining digits. Continue to do this until a number known to be divisible or not by 7 is obtained; you can stop when this number has at most 2 digits because you are supposed to know if a number of at most 2 digits is divisible by 7 or not.
         * The original number is divisible by 7 if and only if the last number obtained using this procedure is divisible by 7.
         * Examples:
         *   1 - m = 371 -> 37 − (2×1) -> 37 − 2 = 35 ; thus, since 35 is divisible by 7, 371 is divisible by 7.
         * The number of steps to get the result is 1.
         *   2 - m = 1603 -> 160 - (2 x 3) -> 154 -> 15 - 8 = 7 and 7 is divisible by 7.
         *   3 - m = 372 -> 37 − (2×2) -> 37 − 4 = 33 ; thus, since 33 is not divisible by 7, 372 is not divisible by 7.
         * The number of steps to get the result is 1.
         *   4 - m = 477557101->47755708->4775554->477547->47740->4774->469->28 and 28 is divisible by 7, so is 477557101.
         * The number of steps is 7.
         * Task: Your task is to return to the function seven(m) (m integer >= 0) an array (or a pair, depending on the language) of numbers, the first being the last number m with at most 2 digits obtained by your function (this last m will be divisible or not by 7), the second one being the number of steps to get the result.
         *   seven(371) should return [35, 1]
         *   seven(1603) should return [7, 2]
         *   seven(477557101) should return [28, 7]
         */
        fun seven(n:Long) : LongArray {
            return longArrayOf(0)
        }

        /**
         * The accounts of the "Fat to Fit Club (FFC)" association are supervised by John as a volunteered accountant. The association is funded through financial donations from generous benefactors. John has a list of the first n donations: [14, 30, 5, 7, 9, 11, 15] He wants to know how much the next benefactor should give to the association so that the average of the first n + 1 donations should reach an average of 30. After doing the math he found 149. He thinks that he made a mistake. Could you help him?
         * if dons = [14, 30, 5, 7, 9, 11, 15] then new_avg(dons, 30) --> 149
         * The function new_avg(arr, navg) should return the expected donation (rounded up to the next integer) that will permit to reach the average navg.
         * Should the last donation be a non positive number (<= 0) John wants us to throw an error
         * so that he clearly sees that his expectations are not great enough.
         * Notes:
         *   all donations and navg are numbers (integers or floats depending on the language), arr can be empty.
         *   See examples below and "Test Samples" to see which error is to be thrown.
         * new_avg([14, 30, 5, 7, 9, 11, 15], 92) should return 645
         * new_avg([14, 30, 5, 7, 9, 11, 15], 2)
         * should raise an error (ValueError or invalid_argument or DomainError)
         * or return `-1` or ERROR depending on the language
         */
        fun newAvg(a:DoubleArray, navg:Double):Long {
            return 0
        }

        /**
         * The two oldest ages function/method needs to be completed. It should take an array of numbers as its argument and return the two highest numbers within the array. The returned value should be an array in the format [second oldest age, oldest age].
         * The order of the numbers passed in could be any order. The array will always include at least 2 items.
         * For example:
         *   twoOldestAges(listOf(1, 5, 87, 45, 8, 8)) // should return listOf(45, 87)
         */
        fun twoOldestAges(ages: List<Int>): List<Int> {
            return listOf(0, 0)
        }

        /**
         * We have to create a function that receives a connection string with password included and you have to mask the password i.e. change password by asterisks.
         * Preconditions:
         *   non empty valid url
         *   password always next to string section password=
         *   assume password will not contain ampersand sign for sake of simplicity
         *   to make it more real it has non ASCII characters
         *   "password=" and "user" will occur only once
         * empty passwords are not validated but best solutions take empty passwords into account
         * Example:
         * input
         *   jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=12345
         * output
         *   jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=*****
         * Extra readings:
         *   https://alvinalexander.com/java/jdbc-connection-string-mysql-postgresql-sqlserver
         */
        fun hidePasswordFromConnection(urlString: String): String {
            return ""
        }

        /**
         * Take 2 strings s1 and s2 including only letters from ato z. Return a new sorted string, the longest possible, containing distinct letters,
         *   each taken only once - coming from s1 or s2. #Examples: ``` a = "xyaabbbccccdefww" b = "xxxxyyyyabklmopq" longest(a, b) -> "abcdefklmopqwxy"
         * a = "abcdefghijklmnopqrstuvwxyz" longest(a, a) -> "abcdefghijklmnopqrstuvwxyz" ```
         */
        fun longest(s1:String, s2:String):String {
            return ""
        }

        /**
         * In the drawing below we have a part of the Pascal's triangle, lines are numbered from zero (top).
         * We want to calculate the sum of the squares of the binomial coefficients on a given line with a function called easyline (or easyLine or easy-line).
         * Can you write a program which calculate easyline(n) where n is the line number?
         * The function will take n (with: n>= 0) as parameter and will return the sum of the squares of the binomial coefficients on line n.
         * Examples:
         *   easyline(0) => 1
         *   easyline(1) => 2
         *   easyline(4) => 70
         *   easyline(50) => 100891344545564193334812497256
         * Ref: http://mathworld.wolfram.com/BinomialCoefficient.html
         */
        fun easyLine(n:Int) : BigInteger {
            return BigInteger.valueOf(0)
        }

        /**
         * Take a number: 56789. Rotate left, you get 67895.
         * Keep the first digit in place and rotate left the other digits: 68957.
         * Keep the first two digits in place and rotate the other ones: 68579.
         * Keep the first three digits and rotate left the rest: 68597. Now it is over since keeping the first four it remains only one digit which rotated is itself.
         * You have the following sequence of numbers:
         * 56789 -> 67895 -> 68957 -> 68579 -> 68597
         * and you must return the greatest: 68957.
         * Calling this function max_rot (or maxRot or ... depending on the language)
         * max_rot(56789) should return 68957
         */
        fun maxRot(n:Long) : Long {
            return 0
        }

        /**
         * In John's car the GPS records every s seconds the distance travelled from an origin (distances are measured in an arbitrary but consistent unit). For example, below is part of a record with s = 15:
         *   x = [0.0, 0.19, 0.5, 0.75, 1.0, 1.25, 1.5, 1.75, 2.0, 2.25]
         * The sections are:
         *   0.0-0.19, 0.19-0.5, 0.5-0.75, 0.75-1.0, 1.0-1.25, 1.25-1.50, 1.5-1.75, 1.75-2.0, 2.0-2.25
         * We can calculate John's average hourly speed on every section and we get:
         *   [45.6, 74.4, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0]
         * Given s and x the task is to return as an integer the *floor* of the maximum average speed per hour obtained on the sections of x. If x length is less than or equal to 1 return 0 since the car didn't move.
         * Example: with the above data your function gps(x, s)should return 74
         * Note
         * With floats it can happen that results depends on the operations order. To calculate hourly speed you can use:
         *   (3600 * delta_distance) / s.
         */
        fun gps(s:Int, x:DoubleArray):Int {
            return 0
        }

        /**
         * Input : an array of integers.
         * Output : this array, but sorted in such a way that there are two wings:
         *
         * the left wing with numbers decreasing,
         * the right wing with numbers increasing.
         * the two wings have the same length. If the length of the array is odd the wings are around the bottom, if the length is even the bottom is considered to be part of the right wing.
         *
         * each integer l of the left wing must be greater or equal to its counterpart r in the right wing, the difference l - r being as small as possible. In other words the right wing must be nearly as steeply as the left wing.
         *
         * The function is make_valley or makeValley or make-valley.
         *
         * a = [79, 35, 54, 19, 35, 25]
         * make_valley(a) --> [79, 35, 25, *19*, 35, 54]
         * The bottom is 19, left wing is [79, 35, 25], right wing is [*19*, 35, 54].
         * 79..................54
         * 35..........35
         * 25.
         * ..19
         *
         * a = [67, 93, 100, -16, 65, 97, 92]
         * make_valley(a) --> [100, 93, 67, *-16*, 65, 92, 97]
         * The bottom is -16, left wing [100, 93, 67] and right wing [65, 92, 97] have same length.
         * 100.........................97
         * 93..........
         * .........92
         * 67......
         * .....65
         * -16
         *
         * a = [66, 55, 100, 68, 46, -82, 12, 72, 12, 38]
         * make_valley(a) --> [100, 68, 55, 38, 12, *-82*, 12, 46, 66, 72]
         * The bottom is -82, left wing is [100, 68, 55, 38, 12]], right wing is [*-82*, 12, 46, 66, 72].
         *
         * a = [14,14,14,14,7,14]
         * make_valley(a) => [14, 14, 14, *7*, 14, 14]
         *
         * a = [14,14,14,14,14]
         * make_valley(a) => [14, 14, *14*, 14, 14]
         * A counter-example:
         * a = [17, 17, 15, 14, 8, 7, 7, 5, 4, 4, 1]
         * A solution could be [17, 17, 15, 14, 8, 1, 4, 4, 5, 7, 7]
         * but the right wing [4, 4, 5, 7, 7] is much flatter than the left one
         * [17, 17, 15, 14, 8].
         *
         * Summing the differences between left and right wing:
         * (17-7)+(17-7)+(15-5)+(14-4)+(8-4) = 44
         *
         * Consider the following solution:
         * [17, 15, 8, 7, 4, 1, 4, 5, 7, 14, 17]
         * Summing the differences between left and right wing:
         * (17-17)+(15-14)+(8-7)+(7-5)+(4-4) = 4
         * The right wing is nearly as steeply than the right one.
         * Note:
         * Don't modify the input arr in your code... or make a copy of it before modifications.
         */
        fun makeValley(arr:IntArray) : IntArray {
            return intArrayOf(0)
        }

        /**
         * This time no story, no theory. The examples below show you how to write function accum:
         * Examples:
         *   accum("abcd") // -> "A-Bb-Ccc-Dddd"
         *   accum("RqaEzty") // -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
         *   accum("cwAt") // -> "C-Ww-Aaa-Tttt"
         * The parameter of accum is a string which includes only letters from a..z and A..Z.
         */
        fun accum(s:String) : String {
            return ""
        }

        /**
         * Write a function partlist that gives all the ways to divide a list (an array) of at least two elements into two non-empty parts.
         *   Each two non empty parts will be in a pair (or an array for languages without tuples or a structin C - C: see Examples test Cases - )
         *   Each part will be in a string
         *   Elements of a pair must be in the same order as in the original array.
         * Example:
         *   a = ["az", "toto", "picaro", "zone", "kiwi"] -->
         *   [["az", "toto picaro zone kiwi"], ["az toto", "picaro zone kiwi"], ["az toto picaro", "zone kiwi"], ["az toto picaro zone", "kiwi"]]
         * or
         *   a = {"az", "toto", "picaro", "zone", "kiwi"} -->
         *   {{"az", "toto picaro zone kiwi"}, {"az toto", "picaro zone kiwi"}, {"az toto picaro", "zone kiwi"}, {"az toto picaro zone", "kiwi"}}
         * or
         *   a = ["az", "toto", "picaro", "zone", "kiwi"] -->
         *   [("az", "toto picaro zone kiwi"), ("az toto", "picaro zone kiwi"), ("az toto picaro", "zone kiwi"), ("az toto picaro zone", "kiwi")]
         * or
         *   a = [|"az", "toto", "picaro", "zone", "kiwi"|] -->
         *   [("az", "toto picaro zone kiwi"), ("az toto", "picaro zone kiwi"), ("az toto picaro", "zone kiwi"), ("az toto picaro zone", "kiwi")]
         */
        fun partlist(arr:Array<String>) : Array<Array<String>> {
            return arrayOf(arrayOf(""))
        }
    }
}