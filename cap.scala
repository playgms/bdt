def capitalizeWords(sentence: String): String = {
  sentence.split(" ").map(_.capitalize).mkString(" ")
}
