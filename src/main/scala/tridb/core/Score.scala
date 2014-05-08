package net.tridb.core

import com.github.nscala_time.time.Imports._

trait Score {
  def athlete : Athlete
  def event : Event
}

case class DuathlonScore(
  athlete : Athlete, event : Event,

  run1Period : Period,
  run1Ranking : Double,

  t1Period : Period,
  t1Ranking : Double,

  bikePeriod : Period,
  bikeRanking : Double,

  t2Period : Period,
  t2Ranking : Double,

  run2Period : Period,
  run2Ranking : Double

) extends Score
