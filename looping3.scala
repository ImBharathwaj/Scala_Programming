package iteration

object looping3 {
  def main(args: Array[String]){
    var a = Array("do_while", "for", "while")
    var index = 0

    // loop execution
    while (index < a.length)
    {
      if(a(index) == "while"){
        println("index of while is " + index)
      }
      index = index + 1
    }
    var i = 5;
  }
}