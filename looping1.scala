package iteration

object looping {
  def main(args: Array[String]){
    println("This will work");
    for(x <- 0 to 10){
      println(x);
    }
    println("This will also work");
    for(x <- 0 until 10){
      println(x);
    }
    
    // Loop with multiple range
    for(w <- 0 to 3; z <- 8 until 10){
      println("Value of w is: "+w);
      println("Value of z is: "+z);
    }
  }
}