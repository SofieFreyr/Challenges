package dailyChallenges

//TODO: do time complexity and readability analysis, optimize in a separate folder

//Given a string, find the length of the longest substring without repeating characters.

object Day_4 {

  def charMatch(str: String): Boolean ={
    str.head match {
      case '{' => str.tail.contains('}')
      case '(' => str.tail.contains(')')
      case '['=> str.tail.contains(']')
    }
  }

  def clearDone(str: String): String ={
    str.head match {
      case '{' => str.tail.replace("}","")
      case '(' => str.tail.replace(")","")
      case '['=> str.tail.replace("]","")
    }
  }

  def parenthesisCompleteness(str: String): Boolean ={
    if(str.isEmpty) true
    else if(charMatch(str)) parenthesisCompleteness(clearDone(str))
    else false
  }


  def main(args: Array[String]): Unit = {
    println(parenthesisCompleteness("{())}"))
  }

}
