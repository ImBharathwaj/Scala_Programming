package iteration

object looping2 {
  def main(args: Array[String]){
    var rank = 0
    val rankList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    
    for(rank <- rankList if rank < 7; if rank > 2){
      println("Author rank is : "+rank);
    }
    
    var output  = for{rank <- rankList if rank > 4; if rank != 8}
      yield rank
    
    for(rank <- rankList){
      println("Author rank is : "+rank)
    }

    for(rank <- rankList if rank < 7; if rank > 2){
      println("Author rank is : "+rank);
    }
  }
}