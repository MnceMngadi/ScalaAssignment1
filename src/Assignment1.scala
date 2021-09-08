object Assignment1 {


  def main(args: Array[String]): Unit = {

    println("Task 1")
    task1()
    println()
    println("Task 2")
    task2()
    println()
    println("Task 3")
    task3()
    println()
    println("Task 4")
    var v = new Course("",0.00)
    v.courseId()

  }

  def task1(): Unit ={

    for (sequence <- 50 to 100 by 2) {


       print (sequence+", ")

       }

  }

  def task2(): Unit ={

      val set_one = List(11, 13, 15, 20, 10)
      val set_two = List(10, 7, 8, 19, 10)

      val notOnFirstList = set_two diff set_one
      val notOnSecondList =set_one diff set_two



    for (a <- set_one  if set_two.contains(a)){

      println("The number that exists in the same data structures: "+a)

    }


      print("These numbers are not on the Set_Two: ")
      for(r <- notOnSecondList){

        print(r+", ")

      }

    println()
    print("These numbers are not on the Set_one: ")
    for(r <- notOnFirstList){

      print(r+", ")

    }


  }


  def task3(): Unit ={

      val literal1 = List(99, 10, 5, 5, 7, 10, 1)

      val literal2 = List(10, 30, 50, 4, 5)

      val twoLists = literal1 ++ literal2



    val first = twoLists(0)
    val last = twoLists(twoLists.size-1)
    //val median = twoLists

    println(first+": is the first value of the literals")
    println(last+": is the last value of the literal")

    if(twoLists.size % 2 ==0){

      val mid = twoLists.size / 2

      println(1d * (twoLists(mid) + twoLists(mid) - 1)+": is the median of the literals")

    }else{

      val mid = twoLists.size / 2

      println(1d * twoLists(mid)+": is the median of the literals")

    }





  }


}
