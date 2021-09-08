case class Course(courseName : String, coursePrice: Double) {




    implicit def courseId(){



        var course1 = new Course("ICE362S Elective, FT",40.000)
        var course2 = new Course("ICE262S Elective, FT",35.000)
        var course3 = new Course("ICF152S Elective, FT",30.000)

        var list = List(course1,course2,course3)

        for(c <- list){

            println(c)

        }


    }






}
