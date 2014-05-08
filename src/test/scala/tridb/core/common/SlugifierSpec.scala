
package net.tridb.core.tests

import net.tridb.core.common.Slugifier._

class SlugifierSpec extends UnitSpec {

  describe("slugify") {

    it("downcases the string") {
      slugify("Pedro") should equal("pedro")
    }

    it("replaces spaces with dashes") {
      slugify("pedro santos") should equal("pedro-santos")
    }

    it("completly formats as slug a given string") {
      slugify("Patrícia Simões") should equal("patricia-simoes")
    }

  }

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
