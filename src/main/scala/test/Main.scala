package test

import com.desmondyeung.hashing.XxHash64

object Main {
  def main(args: Array[String]): Unit = {
    val r = XxHash64.hashLong(123, seed = 0)
    println(r)
  }
}
