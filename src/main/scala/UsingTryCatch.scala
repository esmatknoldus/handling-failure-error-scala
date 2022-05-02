import java.io.IOException
// Creating object
object HandleFailureUsingTryCatch
{
  // Main method
  def main(args:Array[String])
  {
    var number1:Int=13
    var number2:Int=0
    try
      {
        print(number1/number2)

      }
    catch
      {
        // Catch block contain cases.
        case io: IOException =>
        {
          println("IOException occurred.")
        }
        case ar : ArithmeticException =>
        {
          println("Cannot divide number by zero.")
        }

      }

  }
}
