package impilit_examples.lab2

/**
  * @author Evgeny Borisov
  */
object RegistryAdditionalListMethods {
  implicit def convertListToExtensionList[T](list: List[T]):ListExtension[T]={
    new ListExtension[T](list)
  }
}
