object BirthdayCakeCandles extends App {
  // Complete the birthdayCakeCandles function below.
  def birthdayCakeCandles(ar: Array[Int]): Int = {
      val mx = ar.max
      ar.count(_==mx)
  }


}
