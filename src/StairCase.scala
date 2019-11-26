object StairCase extends App{
//  #
//  ##
//  ###
//  ####
//  #####
//  ######
// Complete the staircase function below.
  def staircase(n: Int) {
    (1 to n).map( i =>  println( (" ")*(n-i) + ("#"*i)    ))
  }
  staircase(6)
}
