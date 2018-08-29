package difficulty1

import difficulty1.Difficulty1Katas.Companion.makeNegative
import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Test

class MakeNegativeTest {

    @Test
    fun testMakeNegative1() {
        val result = makeNegative(1)
        Assert.assertThat(result, CoreMatchers.`is`(-1))
    }

    @Test
    fun testMakeNegative2() {
        val result = makeNegative(0)
        Assert.assertThat(result, CoreMatchers.`is`(0))
    }

    @Test
    fun testMakeNegative3() {
        val result = makeNegative(-1)
        Assert.assertThat(result, CoreMatchers.`is`(-1))
    }

    @Test
    fun testMakeNegative4() {
        val result = makeNegative(10)
        Assert.assertThat(result, CoreMatchers.`is`(-10))
    }

    @Test
    fun testMakeNegative5() {
        val result = makeNegative(-10)
        Assert.assertThat(result, CoreMatchers.`is`(-10))
    }

}