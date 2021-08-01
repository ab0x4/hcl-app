package com.hclapp.task2

case class Point(x: Int, y: Int)

case class Triangle(p1: Point, p2: Point, p3: Point) {

  def getArea: Double = {
    0.5 * ((p1.x * (p2.y - p3.y)) + (p2.x * (p3.y - p1.y)) + (p3.x * (p1.y - p2.y)))
  }

}
