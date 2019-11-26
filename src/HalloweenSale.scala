object HalloweenSale extends App{
  // Complete the howManyGames function below.
  def howManyGames(p: Int, d: Int, m: Int, s: Int): Int = {
    // Return the number of games you can buy
//    if(s>p && p>d && p>m){
//      val last3 = (1 to p).map(p-d*_).filter(_>m).last//the last number that higher than m
//      println("last3: " + last3)
//      val t1 = (p to last3 by -d)
//      t1.map(i => print(i+"\t"))
//      println()
//      val s1 = t1.size
//      println("s1: "+ s1)
//      val s2 = (s-t1.sum)/m
//      println("s2: "+ s2)
//      val ans = s1 + s2
//      if (ans>0) ans; else 1
//    }else if(s<p){
//      0
//    }else if(s==p){
//      1
//    }else if(p==1){
//      s
//    }else{
//      0
//    }
    var remaining = s
    var value = p
    var count = 0
    while(remaining>m ){
      remaining = remaining - value
      println("remaining: "+remaining+" value: " + value + " count: " + count)
      //update value
      if( remaining-value<m)  value = m
      count = count + 1
    }
    count
  }

//  print(howManyGames(20,3,6,80))
//  print(howManyGames(16,2,1,9981))
//  print(howManyGames(1,100,1,9777))
//  print(howManyGames(100,19,1,180))
//  print(howManyGames(100,3,100,6234))
  print(howManyGames(16,2,1,9981))
}

