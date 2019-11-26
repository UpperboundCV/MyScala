object VeryBigSum extends App{
  // Complete the aVeryBigSum function below.
  def aVeryBigSum(ar: Array[Long]): Long = {
    val dStr = ar.map( i=> i.toString)
    val zStr: Array[String] = dStr.map(str => str.map(c => if( c!='0') '0' else '0'))
    val mxStrLen: Int = zStr.maxBy(_.length).length()
//    println("mxStrlen: "+ mxStrLen)
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


  val data:Array[Long] =  Array(1000000001,  100000002,   10000003,    1000004, 100005)
  println(   aVeryBigSum(data) )
  val data2:Array[Long] = Array(1001458909, 1004570889, 1007019111, 1003302837,
        1002514638, 1006431461, 1002575010, 1007514041, 1007548981, 1004402249)

  println("answer  : " +  aVeryBigSum(data2))
  println("expected: " +  data2.sum)
//  10047237026 => ans
//  10047338126 => expected

}
