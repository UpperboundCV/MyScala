object TimeConversion extends App {
  /*
     * Complete the timeConversion function below.
     */
  def timeConversion(s: String): String = {
    /*
     * Write your code here.
     */
    if (s.toLowerCase contains "am"){

      val t_split = s.toLowerCase().replace("am","").split(":")
      if (t_split(0).toInt<12) {
        s.toLowerCase.replace("am","")
      }else{
        "00:" +t_split(1) + ":" + t_split(2)
      }
    }else {
      val t_split = s.toLowerCase().replace("pm","").split(":")
      if (t_split(0).toInt<12) {
        (t_split(0).toInt + 12).toString + ":" + t_split(1) + ":" + t_split(2)
      }else{
        "12:" +t_split(1) + ":" + t_split(2)
      }
    }
  }

  val timeStr = "12:05:45AM"
  println(timeConversion(timeStr))
  val timeStr2 = "12:40:22AM"
  println(timeConversion(timeStr2))
  val timeStr3 = "12:45:54PM"
  println(timeConversion(timeStr3))
}
