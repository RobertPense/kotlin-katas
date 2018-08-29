package difficulty1

import difficulty1.Difficulty1Katas.Companion.simpleMultiplication
import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Test

class SimpleMultiplicationTest {

    @Test
    fun testSimpleMultiplication1() {
        val result = simpleMultiplication(1)
        Assert.assertThat(result, CoreMatchers.`is`(9))
    }

    @Test
    fun testSimpleMultiplication2() {
        val result = simpleMultiplication(2)
        Assert.assertThat(result, CoreMatchers.`is`(16))
    }

    @Test
    fun testSimpleMultiplication3() {
        val result = simpleMultiplication(0)
        Assert.assertThat(result, CoreMatchers.`is`(0))
    }

    @Test
    fun testSimpleMultiplication4() {
        val result = simpleMultiplication(-1)
        Assert.assertThat(result, CoreMatchers.`is`(-9))
    }

    @Test
    fun testSimpleMultiplication5() {
        val result = simpleMultiplication(-2)
        Assert.assertThat(result, CoreMatchers.`is`(-16))
    }

    @Test
    fun testSimpleMultiplication6() {
        val result = simpleMultiplication(15)
        Assert.assertThat(result, CoreMatchers.`is`(135))
    }

    @Test
    fun testSimpleMultiplication7() {
        val result = simpleMultiplication(-15)
        Assert.assertThat(result, CoreMatchers.`is`(-135))
    }

}