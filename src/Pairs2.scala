object Pairs2 extends App {
  // Complete the pairs function below.
  def pairs2(k: Int, arr: Array[Int]): Int = {
    (0 to arr.length-2)
      .map{ ind => (arr(ind),arr.slice(ind+1, arr.length))}
      .map{ case(x,y) => y.map(z=> if(math.abs(x-z)==k) 1 else 0).sum}.sum
  }

  val k = 2
  val arr = Array(1,5,3,4,2)
  println(pairs2(k,arr))
}
