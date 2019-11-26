object ComparetheTriplets extends  App{
  // Complete the compareTriplets function below.
  def compareTriplets(a: Array[Int], b: Array[Int]): Array[Int] = {
    val index = (0 to a.length-1)
    Array( index.count( i=>a(i)>b(i)), index.count(i=>a(i)<b(i)))
  }


  val a = Array(1,2,3)
  val b = Array(10,1,50)
  compareTriplets(a,b).foreach(print(_))
}
