
package net.tridb.core.common

import com.github.nscala_time.time.Imports._
import org.joda.time.format._

object Ranking {
  val periodFormatter = new PeriodFormatterBuilder()
      .appendHours()
      .maximumParsedDigits(2)
      .appendSeparator(":")
      .appendMinutes()
      .appendSeparator(":")
      .appendSeconds()
      .toFormatter();

  def period(raw : String) : Period = {
    if(raw.count(_ == ':') == 1) {
      periodFormatter.parsePeriod(s"00:$raw")
    } else {
      periodFormatter.parsePeriod(raw)
    }
  }

}
