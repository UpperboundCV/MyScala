object rotLeft extends App{
  // Complete the rotLeft function below.
  def rotLeft(a: Array[Int], d: Int): Array[Int] = {

//    Array(4,5,6)
    if (d>0){
      (0 to a.length-1).map( i =>  a( (i+d)%a.length  )  ).toArray
    }else{
      a
    }

  }


  val data = Array(1, 2, 3)
  rotLeft (data, 4) foreach println
}
