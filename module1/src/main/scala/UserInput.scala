class UserInput {
  def getInt(message: String): Int = {
    scala.io.StdIn.readLine(message).toInt
  }
}