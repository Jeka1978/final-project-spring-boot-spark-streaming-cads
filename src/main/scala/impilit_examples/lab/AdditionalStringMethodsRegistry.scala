package impilit_examples.lab

/**
  * @author Evgeny Borisov
  */
object AdditionalStringMethodsRegistry {

  implicit def idontcarehowtocallthismethodbecause(str: String):StringExtension=new StringExtension(str)

}
