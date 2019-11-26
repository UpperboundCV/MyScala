object Pairs extends App{
  // Complete the pairs function below.
  def pairs(k: Int, arr: Array[Int]): Int = {
    //exceed time limit
    def countPairs(target:Int ,h:Int, arrTail:Array[Int], ans: Int): Int = {
      if(arrTail.length>=1){
        val cnt = arrTail.map(x=> if(math.abs(h-x)==target) 1 else 0).sum
        countPairs(target, arrTail.head, arrTail.tail, ans+cnt)
      }else{
        ans
      }
    }

    countPairs(k,arr.head, arr.tail, 0)

  }

  val k = 2
  val arr = Array(1,5,3,4,2)
  println(pairs(k,arr))
}
