package com.hclapp.task3

import scala.io.Source
import scala.util.{Try, Using}

case class Team(rank: Int,
                name: String,
                played: Int,
                wins: Int,
                draws: Int,
                defeats: Int,
                scoredFor: Int,
                scoredAgainst: Int,
                points: Int) {

  override def toString(): String = {
    s"Team(rank:$rank name:$name P:$played W:$wins L:$draws D:$defeats F:$scoredFor A:$scoredAgainst Pts:$points)"
  }

}

object FootballParser {

  def parseFile(file: String): Try[Seq[Team]] = {
    Using(Source.fromResource(file)) {
      _.getLines().toSeq.tail.flatMap(line => {
        // using flatmap to avoid double scan of the list to exclude --- line
        if (line.contains("---")) None else Seq(parseLine(line))
      })
    }
  }

  private[task3] def parseLine(line: String): Team = {
    val data = line.replaceAll("[.-]", "").split(" +").map(_.trim).filter(v => v.nonEmpty)
    Team(data(0).replace(".", "").toInt,
      data(1), data(2).toInt, data(3).toInt, data(4).toInt, data(5).toInt, data(6).toInt, data(7).toInt, data(8).toInt)
  }

}

object FootballStatService {

  def findTeamWithSmallestScoredDiff(teams: Seq[Team]): Team = {
    teams.map(t => (t, Math.abs(t.scoredFor - t.scoredAgainst))).minBy(_._2)._1
  }

}
