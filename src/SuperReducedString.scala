object SuperReducedString extends App{
  // Complete the superReducedString function below.
  def superReducedString(s: String): String = {
    def reducedString( t:String, ind:Int): String = {
      if(ind<t.length-1)
        if(t(ind)==t(ind+1)) {//acdqglrfkqyuqfjkxyqvnrtysfrzrmzlygfveulqfpdbhlqdqrrqdqlhbdpfqluevfgylzmrzrfsytrnvqyxkjfquyqkfrlacdqj
          if(t.length>2)
            if(ind>0)
              reducedString( t.slice(0, ind)+ t.slice(ind+2, t.length), ind-1)//abccddd
            else
              reducedString( t.slice(0, ind)+ t.slice(ind+2, t.length), ind)//abccddd
          else
            "Empty String"
        } else if(t(ind)!=t(ind+1)){
            if(ind+1<t.length-1)
              reducedString( t, ind+1)
            else
              t
        }else{
          t
        }
      else{
        reducedString(t, 0)
      }
    }

//    abba aa 0

    reducedString(s, 0)

  }

//  val s = "aaabccddd"
//  val s = "aa"
//  val s = "baab"
  val s = "acdqglrfkqyuqfjkxyqvnrtysfrzrmzlygfveulqfpdbhlqdqrrqdqlhbdpfqluevfgylzmrzrfsytrnvqyxkjfquyqkfrlacdqj"
  println(superReducedString(s: String))
}
