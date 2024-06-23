def longestWord(words: Array[String]): (String, Int) = {
  words.map(word => (word, word.length)).maxBy(_._2)
}

val words = Array("games", "television", "rope", "table")
println(longestWord(words)) 
