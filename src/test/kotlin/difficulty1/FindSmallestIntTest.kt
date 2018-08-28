package difficulty1

import difficulty1.Difficulty1Katas.Companion.findSmallestInt
import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Test

class FindSmallestIntTest {

    @Test
    fun testFindSmallestInt1() {
        val smallestInt = findSmallestInt(listOf(1, 2, 3, 4, 5))
        Assert.assertThat(smallestInt, CoreMatchers.`is`(1))
    }

    @Test
    fun testFindSmallestInt2() {
        val smallestInt = findSmallestInt(listOf(0, 1))
        Assert.assertThat(smallestInt, CoreMatchers.`is`(0))
    }

    @Test
    fun testFindSmallestInt3() {
        val smallestInt = findSmallestInt(listOf(-1, 0, 1))
        Assert.assertThat(smallestInt, CoreMatchers.`is`(-1))
    }

    @Test
    fun testFindSmallestInt4() {
        val smallestInt = findSmallestInt(listOf(-100, 1, 100))
        Assert.assertThat(smallestInt, CoreMatchers.`is`(-100))
    }

    @Test
    fun testFindSmallestInt5() {
        val smallestInt = findSmallestInt(listOf(200, 1000))
        Assert.assertThat(smallestInt, CoreMatchers.`is`(200))
    }
}