package example

import scala.collection.convert.ImplicitConversions.`collection asJava`

object Exs {

  def ex2_3a = {
    //#2
    val orig_str = "Hello, World!"
    println(orig_str)

    //#3 a.1
    println(orig_str.reverse)

    //#3 a.1
    var sb = new StringBuilder()
    for (c <- (0 to orig_str.length - 1).reverse) {
      //      println(orig_str(c))
      sb.append(orig_str(c))
    }
    println(sb.toString())

    //#3 a.2
    println(orig_str.toLowerCase())
    //#3 a.2
    println(orig_str.map(i => i.toLower))

    //#3 a.3
    println(orig_str.replace("!", ""))
    //#3 a.3
    println(orig_str.substring(0, orig_str.length - 1))

    //#3 a.4
    var new_str = orig_str + " and goodbye python!"
    println(new_str)
  }

  def ex3_b(year_s: Float, prem_perc: Float, meal_compens: Float): Float = {
    //suppose, that meal compensation given for day

    val fee_percent = 13

    val wo_meal = year_s - meal_compens
    val wo_prem = wo_meal / (1 + prem_perc / 100)

    val month_sal = (wo_prem / 12) * (1 - fee_percent / 100)

    return month_sal
  }

  def ex3_c(year_s: Float, prem_perc: Float, meal_compens: Float, sals: List[Float]) = {
    val sal = ex3_b(year_s, prem_perc, meal_compens)

    //get a middle sal
    var sum: Float = 0
    sals.foreach(i => {
      sum += i
    })

    val middle_sal = sum / sals.length
    println("Middle salary is " + middle_sal.toString)

    sals.zipWithIndex.foreach { case (v, i) => {
      println("For sal " + i.toString + " (" + v.toString + ") deviation is " + (v - middle_sal).toString)
    }
    }

    println("Deviation for year sal " + year_s.toString + " included premuim " + prem_perc.toString +
      " with year meal compensaion " + meal_compens.toString + " is " + (sal - middle_sal).toString)

    middle_sal
  }

  //#3g
  def get_middle(list: List[Float], low: Float, high: Float): List[Float] = {
    var mlist = List[Float]()

    list.foreach(v => {
      if (v >= low && v <= high) {
        mlist = mlist :+ v
      }
    })

    mlist
  }


}
