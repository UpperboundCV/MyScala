object UtopainTree extends App{
  def utopainTree(n: Int): Int = {
    def growth(round: Int, n: Int, ans:Int): Int = {
      if(round<n) {
        if(round%2!=0){
          growth(round+1, n, ans+1)
        }else{
          growth(round+1, n, ans*2)
        }
      }else{
        ans
      }
    }


    growth(0, n, 1)
  }

  val n = 4
  println(utopainTree(n))

}
