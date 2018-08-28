package difficulty1

import difficulty1.Difficulty1Katas.Companion.century
import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.assertThat
import org.junit.Test

class CenturyTest {

    @Test
    fun testCentury1() {
        val century = century(50)
        assertThat(century, `is`(1))
    }

    @Test
    fun testCentury2() {
        val century = century(100)
        assertThat(century, `is`(1))
    }

    @Test
    fun testCentury3() {
        val century = century(150)
        assertThat(century, `is`(2))
    }

    @Test
    fun testCentury4() {
        val century = century(201)
        assertThat(century, `is`(3))
    }

    @Test
    fun testCentury5() {
        val century = century(0)
        assertThat(century, `is`(0))
    }

}