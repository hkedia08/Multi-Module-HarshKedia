object Calculator extends App {
  val userInput = new UserInput
  val mathOperations = new MathematicalOperations

  val x = userInput.getInt("Enter the first number: ")
  val y = userInput.getInt("Enter the second number: ")

  println(s"$x + $y = ${mathOperations.add(x, y)}")
  println(s"$x - $y = ${mathOperations.subtract(x, y)}")
  println(s"$x * $y = ${mathOperations.multiply(x, y)}")
  println(s"$x / $y = ${mathOperations.divide(x, y)}")
}