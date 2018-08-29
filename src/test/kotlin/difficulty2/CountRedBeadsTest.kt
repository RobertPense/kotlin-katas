package difficulty2

import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Test

class CountRedBeadsTest {

    @Test
    fun testCountRedBeads1() {
        val result = Difficulty2Katas.countRedBeads(1)
        Assert.assertThat(result, CoreMatchers.`is`(0))
    }

    @Test
    fun testCountRedBeads2() {
        val result = Difficulty2Katas.countRedBeads(-1)
        Assert.assertThat(result, CoreMatchers.`is`(0))
    }

    @Test
    fun testCountRedBeads3() {
        val result = Difficulty2Katas.countRedBeads(2)
        Assert.assertThat(result, CoreMatchers.`is`(2))
    }

    @Test
    fun testCountRedBeads4() {
        val result = Difficulty2Katas.countRedBeads(3)
        Assert.assertThat(result, CoreMatchers.`is`(4))
    }

    @Test
    fun testCountRedBeads5() {
        val result = Difficulty2Katas.countRedBeads(5)
        Assert.assertThat(result, CoreMatchers.`is`(8))
    }

    @Test
    fun testCountRedBeads6() {
        val result = Difficulty2Katas.countRedBeads(10)
        Assert.assertThat(result, CoreMatchers.`is`(18))
    }

    @Test
    fun testCountRedBeads7() {
        val result = Difficulty2Katas.countRedBeads(50)
        Assert.assertThat(result, CoreMatchers.`is`(98))
    }

}