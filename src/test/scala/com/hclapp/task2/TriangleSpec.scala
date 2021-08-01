package com.hclapp.task2

import org.scalatest.wordspec.AnyWordSpec

class TriangleSpec extends AnyWordSpec {

  "Triangle" when {

    "getArea" should {

      "return area of triangle with defined vertexes" in {
        assert(Triangle(Point(-5, 0), Point(5, 0), Point(0, 20)).getArea == 100d)
      }

      "return zero area if vertexes are same point" in {
        assert(Triangle(Point(0, 0), Point(0, 0), Point(0, 20)).getArea == 0d)
      }

    }

  }

}
