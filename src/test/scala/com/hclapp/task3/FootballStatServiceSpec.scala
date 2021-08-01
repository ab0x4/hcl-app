package com.hclapp.task3

import org.scalatest.wordspec.AnyWordSpec

class FootballStatServiceSpec extends AnyWordSpec {

  "FootballStatService" when {

    "findTeamWithSmallestScoredDiff" should {

      "return team with smallest scored diff" in {
        val teams = Seq(
          Team(1, "team1", 0, 0, 0, 0, 50, 20, 0),
          Team(2, "team2", 0, 0, 0, 0, 10, 21, 0),
          Team(3, "team3", 0, 0, 0, 0, 11, 12, 0),
          Team(4, "team4", 0, 0, 0, 0, 21, 9, 0)
        )
        assert(FootballStatService.findTeamWithSmallestScoredDiff(teams) == teams(2))
      }

    }

  }

}
