import org.apache.spark.{SparkConf, SparkContext}

val conf = new SparkConf().setAppName("WordCount").setMaster("local")
val sc = new SparkContext(conf)

val textFile = sc.textFile("path/to/text.txt")
val wordCounts = textFile.flatMap(line => line.split(" "))
  .map(word => (word, 1))
  .reduceByKey(_ + _)

wordCounts.saveAsTextFile("path/to/output")

val frequentWords = wordCounts.filter(_._2 > 4)
frequentWords.collect().foreach(println)

sc.stop()
