package example

object App {
  def main(argv: Array[String]) = {
    //#3a
    //Exs.ex2_3a


    //#3b
    val month_sal = Exs.ex3_b(3600, 100, 120)
    println(month_sal)

    //#3c
    var salaries:List[Float] = List(100, 150, 200, 80, 120, 75)
    var middle_sal = Exs.ex3_c(3600, 100, 120, salaries)


    //#3d
    println("Need to correct sal:  " + (month_sal - middle_sal))
    println("New salary should be " + (month_sal - (month_sal - middle_sal)).toString)

    //#3e
    salaries=salaries:+350.toFloat
    salaries=salaries:+90.toFloat
    println("New salaries "+salaries)

    salaries=salaries.sorted
    println("Sorted: "+salaries)

    //#3f
    val new_s=130

    def get_idx:Int={
      var i:Int=0
      for (i <- 0 to (salaries.length - 1)) {
        if (salaries(i) > new_s) {
          return i
        }
      }
      return salaries.length
    }

    val c_idx = get_idx


    salaries=salaries.take(c_idx) ++ List[Float](new_s) ++ salaries.drop(c_idx)
    println("New salaries list ",salaries)

    //#3g

    println("Middles: ", Exs.get_middle(salaries, 100,200))

    //#3h
    salaries=salaries.map(v=>v*1.07.toFloat)

    println("After indexation ", salaries)





  }


}
