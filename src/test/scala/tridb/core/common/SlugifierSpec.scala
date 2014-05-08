
package net.tridb.core.tests

import net.tridb.core.common.Slugifier._

class SlugifierSpec extends UnitSpec {

  describe("decompose") {

    it("handles basic examples") {
      decompose("Pedro") should equal("Pedro")
      decompose("Fernando Carmo") should equal("Fernando Carmo")
    }

    it("handles portuguese names") {
      decompose("André") should equal("Andre")
      decompose("João Conceição") should equal("Joao Conceicao")
    }
  }
}
