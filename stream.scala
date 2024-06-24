import org.apache.spark.streaming.{StreamingContext, Seconds}
val ssc =new StreamingContext(sc, Seconds (2))
val streams= ssc.socketTextStream("localhost", 1234, org.apache.spark.storage.StorageLevel.MEMORY_ONLY)
val wordcount =streams.flatMap(_.split(" ")).map(w=> (w,1)).reduceByKey(_+_)
wordcount.print
ssc.start

//nc -lk 1234
