package ctci.chapter1


import org.scalatest.funsuite.AnyFunSuite

class IsUniqueSuite extends AnyFunSuite {

  test("isUnique false") {
    assert(!IsUnique.isUnique1("abcda"))
    assert(!IsUnique.isUnique2("abcda"))
    assert(!IsUnique.isUnique3("abcda"))
  }

  test("isUnique true") {
    assert(IsUnique.isUnique1("abcdefg"))
    assert(IsUnique.isUnique2("abcdefg"))
    assert(IsUnique.isUnique3("abcdefg"))
  }

  test("empty String") {
    assert(IsUnique.isUnique1(""))
    assert(IsUnique.isUnique2(""))
    assert(IsUnique.isUnique3(""))
  }

  test("repeated chars") {
    assert(!IsUnique.isUnique1("aaaaaa"))
    assert(!IsUnique.isUnique2("aaaaaa"))
    assert(!IsUnique.isUnique3("aaaaaa"))
  }

}

////////////////////////////////////////
// [info] IsUniqueSuite:
// [info] - isUnique false
// [info] - isUnique true
// [info] - empty String
// [info] - repeated chars
// [info] Run completed in 350 milliseconds.
// [info] Total number of tests run: 4
// [info] Suites: completed 1, aborted 0
// [info] Tests: succeeded 4, failed 0, canceled 0, ignored 0, pending 0
// [info] All tests passed.
////////////////////////////////////////
