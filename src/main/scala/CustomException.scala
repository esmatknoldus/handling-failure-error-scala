//create a custom exception
class CustomException(msg: String) extends Exception(msg) {}
class ExceptionEx {
  @throws(classOf[CustomException])
  def divide(number1: Int, number2: Int) {
    var result: Int = 0;
    if (number2 == 0) {
      throw new CustomException("Cannot divide number by zero")
    } else {
      result = (number1 / number2);
      printf("Result: %d\n", result);
    }
  }
}

object MyException {
  // Main method
  def main(args: Array[String]) {
    try {
      var obj = new ExceptionEx();
      obj.divide(9, 0);
    } catch {
      case e: CustomException => println(e);
    } finally {
      println("Finally block executed")
    }
  }
}