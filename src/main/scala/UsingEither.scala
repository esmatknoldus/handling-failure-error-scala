// Creating object and inheriting
// main method of the trait App
object UsingEither extends App{


   //A method to demonstrate how to declare that a method returns an Either,
   // and code that returns a Left or Right.

  def division(number1: Int, number2: Int): Either[String, Int] = {
    if (number2 == 0) Left("Cannot divide number by zero")
    else Right(number1 / number2)
  }

  println(division(13, 0))

  println(division(13, 13))

}