package com.hclapp.task3

object PremierLeagueStatApp {

  def main(args: Array[String]): Unit = {
    System.out.println("App finds the team with the smallest difference in ‘for’ and ‘against’ goals")

    // read stats
    val inputFile = "football.dat"
    val teamsTry = FootballParser.parseFile(inputFile)
    teamsTry.map(teams => {
      val result = FootballStatService.findTeamWithSmallestScoredDiff(teams)
      System.out.println(s"Team with the smallest scored diff: $result")
    }).getOrElse("Failed to read input file")

  }

}
