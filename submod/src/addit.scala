package submod

object addit:
  def plusly(a: Int, b: Int) = a + b

  testing {
    class PluslySuite extends munit.FunSuite:
      test("plusly") {
        assertEquals(plusly(20, 23), 43)
      }
  }
end addit

@main def runAddit() =
  println(s"2 + 3 = ${addit.plusly(2, 3)}")

