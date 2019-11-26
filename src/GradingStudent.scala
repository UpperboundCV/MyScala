object GradingStudent extends App{
  def gradingStudents(grades: Array[Int]): Array[Int] = {
    // Write your code here
    grades.map { x =>

        if (x % 10 > 5) {
          val next = (x / 10) * 10 + 10
          if (next - x < 3 && next>=40)
            next
          else
            x
        } else {
          val next = (x / 10) * 10 + 5
          if (next - x < 3 && next>=40)
            next
          else
            x
        }
      }

  }
  val input1 = Array(73,67,38,33)
  gradingStudents(input1) foreach println
}
