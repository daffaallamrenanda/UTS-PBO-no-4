package utspbonomer4;

public class CourseDemo { 

    public static void main(String[] args) {
       Instructor myInstructor = new Instructor("Khairuman", "Rifqi", "AA1");

       TextBook myTextBook = new TextBook("Pendidikan Akuntansi", "Tere Liye", "Airlangga");

       Course myCourse = new Course("Akuntansi", myInstructor, myTextBook);

       System.out.println(myCourse);
    }

}