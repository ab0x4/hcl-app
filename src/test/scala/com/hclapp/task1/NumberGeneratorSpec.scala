package com.hclapp.task1

import org.scalatest.wordspec.AnyWordSpec

class NumberGeneratorSpec extends AnyWordSpec {

  "NumberGenerator" when {

    "generate" should {

      "return sequence of numbers using fromNum and toNum" in {
        assert(NumberGenerator.generate(1, 3) == Seq(1, 2, 3))
      }

      "return sequence of numbers using fromNum, toNum and step" in {
        assert(NumberGenerator.generate(1, 5, step = 2) == Seq(1, 3, 5))
      }

      "return empty sequence if toNum greater than fromNum" in {
        assert(NumberGenerator.generate(2, 1) == Seq())
      }

    }

  }

}
