package com.hclapp.task3

import org.scalatest.wordspec.AnyWordSpec

class FootballParserSpec extends AnyWordSpec {

  "FootballParser" when {

    "parseLine" should {

      "return parsed team" in {
        val line = "    1. Arsenal         38    26   9   3    79  -  36    87"
        assert(FootballParser.parseLine(line) == Team(1, "Arsenal", 38, 26, 9, 3, 79, 36, 87))
      }

    }

  }

}
