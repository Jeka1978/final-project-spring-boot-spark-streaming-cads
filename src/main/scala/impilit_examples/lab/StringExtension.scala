package impilit_examples.lab

/**
  * @author Evgeny Borisov
  */
class StringExtension(str: String) {
    def isBlank:Boolean={
      str==null || str.isEmpty
    }
}
