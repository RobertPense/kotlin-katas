package difficulty1

import difficulty1.Difficulty1Katas.Companion.century
import difficulty1.Difficulty1Katas.Companion.opposite
import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.assertThat
import org.junit.Test

class Difficulty1KatasTest {

    @Test
    fun testCentury() {
        val century = century(1)
        assertThat(century, `is`(0))
    }

    @Test
    fun testOpposite() {
        val opposite = opposite(1)
        assertThat(opposite, `is`(0))
    }

}