
object MiniMaxSum extends App{

  // Complete the miniMaxSum function below.
  def miniMaxSum(arr: Array[Int]) {
    def aVeryBigSum(ar: Array[Long]): Long = {
      val dStr = ar.map( i=> i.toString)
      val zStr: Array[String] = dStr.map(str => str.map(c => if( c!='0') '0' else '0'))
      val mxStrLen: Int = zStr.maxBy(_.length).length()

      //    val zPadding: Seq[String] =   "0"*mxStrLen +: (0 to dStr.length-1).map(i => zStr(i).substring(0, mxStrLen - zStr(i).length ) + dStr(i) )
      val zPadding: Seq[String] =   (0 to dStr.length-1).map(i => zStr(i).substring(0, mxStrLen - zStr(i).length ) + dStr(i) )
      //    zPadding.foreach(println(_))
      val vecColStr = (mxStrLen-1 to 0 by -1).map( i => zPadding.map( str => str(i)))
      val vecColInt = vecColStr.map( str => str.map( _.toString.toInt ))
      val rvecColInt = vecColInt.reverse
      val col = vecColInt.length-1
      var ex = 0
      (col to 0 by -1 ).map{ i => {
        if(i== rvecColInt.length-1){  ex = rvecColInt( rvecColInt.length-1 ).sum; rvecColInt( rvecColInt.length-1 ).sum%10;}
        else if(i== 0){ rvecColInt(i).sum + ex/10}
        else{ val bex = ex; ex = ( rvecColInt(i).sum + bex/10); ( rvecColInt(i).sum + bex/10)%10;}
      }}.reverse.mkString("").toLong

    }

    val arrSort = arr.sortWith(_<_).map(_.toLong)
    val mxSum = if(arrSort.tail.sum<0) aVeryBigSum(arrSort.tail); else arrSort.tail.sum
    val mnSum = if(arrSort.reverse.tail.sum<0) aVeryBigSum(arrSort.reverse.tail); else arrSort.reverse.tail.sum
    println(mnSum + " " + mxSum)
  }

  miniMaxSum(Array(1, 2, 3, 4, 5))
  val input1 = Array(256741038, 623958417, 467905213, 714532089, 938071625)
  miniMaxSum(input1)//2063136757 2744467344
  println("2063136757 2744467344")
}
