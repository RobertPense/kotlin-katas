package difficulty1

import difficulty1.Difficulty1Katas.Companion.replace
import difficulty1.Difficulty1Katas.Companion.simpleMultiplication
import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Test

class ReplaceTest {

    @Test
    fun testReplace1() {
        val result = replace("")
        Assert.assertThat(result, CoreMatchers.`is`(""))
    }

    @Test
    fun testReplace2() {
        val result = replace("abcdefghijklmnopqrstuvwxyz")
        Assert.assertThat(result, CoreMatchers.`is`("!bcd!fgh!jklmn!pqrst!vwxyz"))
    }

    @Test
    fun testReplace3() {
        val result = replace("ABCDEFGHIJKLMNOPQRSTUVWXYZ")
        Assert.assertThat(result, CoreMatchers.`is`("!BCD!FGH!JKLMN!PQRST!VWXYZ"))
    }

    @Test
    fun testReplace4() {
        val result = replace("Test sentence")
        Assert.assertThat(result, CoreMatchers.`is`("T!st s!nt!nc!"))
    }

    @Test
    fun testReplace5() {
        val result = replace("A test sentence      with mmany vowels")
        Assert.assertThat(result, CoreMatchers.`is`("! t!st s!nt!nc!      w!th mm!ny v!w!ls"))
    }

}