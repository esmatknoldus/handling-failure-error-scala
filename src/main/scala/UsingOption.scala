object UsingOption {
  // Main method
  def main(args: Array[String]) {

    // Creating a Map
    val category = Map("Apple" -> "Fruit",
      "Tomato" -> "Vegetable")

    // Accessing keys of the map
    val apple = category.get("Apple")
    val space= category.get("Space")

    println("Apple Category: " +pattern(apple))
    println("Space Category: " +pattern(space))
  }

  def pattern(z: Option[String]) = z match {

    // for 'Some' class the key for
    // the given value is displayed
    case Some(s) => (s)

    // for 'None' class the below string
    // is displayed
    case None => ("Not found")

  }
}
