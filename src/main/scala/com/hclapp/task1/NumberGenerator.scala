package com.hclapp.task1

object NumberGenerator {

  def generate(fromNum: Int, toNum: Int, step: Int = 1): Seq[Int] = {
    fromNum to toNum by step
  }

}

object NumberGeneratorApp {

  def main(args: Array[String]): Unit = {
    System.out.println("Prints numbers from 1 to 10:")

    val numbers = NumberGenerator.generate(1, 10)
    val numbersStr = numbers.map(_.toString).mkString(",")
    System.out.println(numbersStr)
  }

}
