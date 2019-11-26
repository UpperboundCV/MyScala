import scala.collection.immutable
object Pairs3 extends App{
  // Complete the pairs function below.
  def pairs3(k: Int, arr: Array[Int]): Int = {
    val len = arr.length
    val ind = (0 to len-2)
    ind.map( i => (i+1 to len-1).map(p => if(math.abs(arr(i)-arr(p))==k) 1 else 0 ).sum).sum
  }

  val k = 2
  val arr = Array(1,5,3,4,2)
  println(pairs3(k,arr))
}
