
package net.tridb.core.tests

import net.tridb.core.common.Ranking._
import com.github.nscala_time.time.Imports._

class RankingSpec extends UnitSpec {

  describe("period") {

    it("ignores hours if not provided") {
      val span = period("10:34")
      span.minutes should equal(10)
      span.seconds should equal(34)
    }

    it("considers seconds full period") {
      val span = period("00:00:50")
      span.hours should equal(0)
      span.minutes should equal(0)
      span.seconds should equal(50)
    }

  }

}
