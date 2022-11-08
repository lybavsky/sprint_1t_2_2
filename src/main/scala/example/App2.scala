package example

class App2 {
  val testv:String = "first"
  var testv2:String = "second"

  def change(testvtoch: String) = {
    this.testv2 = testvtoch
  }

  def pr = {
    print(testv+":"+testv2+"\n")
  }

}
