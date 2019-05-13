package impilit_examples.lab

import org.junit.{Assert, Test}

/**
  * @author Evgeny Borisov
  */
class StringExtensionsTest {

  import AdditionalStringMethodsRegistry._

  @Test
  def testIsBlankIsWorkingOnNullString():Unit={
    var str = ""
    str = null
    Assert.assertTrue(str.isBlank)
  }
  @Test
  def testIsBlankIsWorkingEmptyString():Unit={
    var str = ""
    Assert.assertTrue(str.isBlank)
  }
  @Test
  def testIsBlankIsWorkingForNonEmptyString():Unit={
    var str = "scala"
    Assert.assertFalse(str.isBlank)
  }

}









