package difficulty1

import difficulty1.Difficulty1Katas.Companion.opposite
import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.assertThat
import org.junit.Test

class OppositeTest {

    @Test
    fun testOpposite1() {
        val opposite = Difficulty1Katas.opposite(-1)
        assertThat(opposite, `is`(1))
    }

    @Test
    fun testOpposite2() {
        val opposite = Difficulty1Katas.opposite(1)
        assertThat(opposite, `is`(-1))
    }

    @Test
    fun testOpposite3() {
        val opposite = Difficulty1Katas.opposite(0)
        assertThat(opposite, `is`(0))
    }

    @Test
    fun testOpposite4() {
        val opposite = Difficulty1Katas.opposite(50)
        assertThat(opposite, `is`(-50))
    }

    @Test
    fun testOpposite5() {
        val opposite = Difficulty1Katas.opposite(-50)
        assertThat(opposite, `is`(50))
    }
}