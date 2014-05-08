
package net.tridb.core.common

import java.text._

object Slugifier {

  def slugify(raw : String) = raw

  def decompose(raw : String) = {
    Normalizer.normalize(raw, Normalizer.Form.NFKD).replaceAll("\\p{InCombiningDiacriticalMarks}+","")
  }
}
