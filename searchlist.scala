def search(list: List[Int], number: Int): Boolean = {
  list.contains(number)
}

val numbers = List(1, 2, 3, 4, 5)
println(search(numbers, 3))  
println(search(numbers, 6)) 
