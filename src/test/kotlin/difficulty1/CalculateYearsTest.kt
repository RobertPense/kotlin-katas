package difficulty1

import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Test

class CalculateYearsTest {

    @Test
    fun testCalculateYears1() {
        val result = Difficulty1Katas.calculateYears(1)
        Assert.assertThat(result.get(0), CoreMatchers.`is`(1))
        Assert.assertThat(result.get(1), CoreMatchers.`is`(15))
        Assert.assertThat(result.get(2), CoreMatchers.`is`(15))
    }

    @Test
    fun testCalculateYears2() {
        val result = Difficulty1Katas.calculateYears(2)
        Assert.assertThat(result.get(0), CoreMatchers.`is`(2))
        Assert.assertThat(result.get(1), CoreMatchers.`is`(24))
        Assert.assertThat(result.get(2), CoreMatchers.`is`(24))
    }

    @Test
    fun testCalculateYears3() {
        val result = Difficulty1Katas.calculateYears(3)
        Assert.assertThat(result.get(0), CoreMatchers.`is`(3))
        Assert.assertThat(result.get(1), CoreMatchers.`is`(28))
        Assert.assertThat(result.get(2), CoreMatchers.`is`(29))
    }

    @Test
    fun testCalculateYears4() {
        val result = Difficulty1Katas.calculateYears(5)
        Assert.assertThat(result.get(0), CoreMatchers.`is`(5))
        Assert.assertThat(result.get(1), CoreMatchers.`is`(36))
        Assert.assertThat(result.get(2), CoreMatchers.`is`(39))
    }

    @Test
    fun testCalculateYears5() {
        val result = Difficulty1Katas.calculateYears(10)
        Assert.assertThat(result.get(0), CoreMatchers.`is`(10))
        Assert.assertThat(result.get(1), CoreMatchers.`is`(56))
        Assert.assertThat(result.get(2), CoreMatchers.`is`(64))
    }

}