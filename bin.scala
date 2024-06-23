def binarySearch(arr: Array[Int], target: Int, low: Int = 0, high: Int = Int.MaxValue): Boolean = {
  val h = if (high == Int.MaxValue) arr.length - 1 else high
  if (low > h) false
  else {
    val mid = (low + h) / 2
    if (arr(mid) == target) true
    else if (arr(mid) > target) binarySearch(arr, target, low, mid - 1)
    else binarySearch(arr, target, mid + 1, h)
  }
}

val numbers = Array(1, 2, 3, 4, 5)
println(binarySearch(numbers, 3))  // True
println(binarySearch(numbers, 6))  // False

