import org.apache.spark.{SparkConf, SparkContext}

val conf = new SparkConf().setAppName("CombineByKeyExample").setMaster("local")
val sc = new SparkContext(conf)

val items = Seq(("coffee", 2), ("cappuccino", 5), ("tea", 3), ("coffee", 10), ("cappuccino", 15))

val rdd = sc.parallelize(items)
val combined = rdd.combineByKey(
  (value: Int) => value,
  (acc: Int, value: Int) => acc + value,
  (acc1: Int, acc2: Int) => acc1 + acc2
)
combined.collect().foreach(println)

sc.stop()
