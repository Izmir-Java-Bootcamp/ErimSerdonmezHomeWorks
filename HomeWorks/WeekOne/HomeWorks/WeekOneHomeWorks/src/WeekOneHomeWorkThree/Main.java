/** @author Erim Serdönmez
 *  WeekOneHomeWorkThree -- OOP
 */
package WeekOne.HomeWorks.WeekOneHomeWorks.src.WeekOneHomeWorkThree;

public class Main {
    public static void main(String[] args) {
        // Creating Personal Data objects
        PersonalData p1 = new PersonalData(1990, 03, 27, 404505228);
        PersonalData p2 = new PersonalData(1997, 05, 15, 405500209);
        PersonalData p3 = new PersonalData(1995, 05, 25, 405522321);
        PersonalData p4 = new PersonalData(1992, 05, 29, 404522511);
        PersonalData p5 = new PersonalData(1990, 04, 29, 404522136);

        // Setting Adresses for these objects
        p1.setAdress("İzmir / Karşıyaka");
        p2.setAdress("İzmir / Konak");
        p3.setAdress("İstanbul / Bomonti");
        p4.setAdress("İstanbul / Şişli");
        p5.setAdress("USA / Washington DC");

        // Creating Students
        Student s1 = new Student("Erim", 5000, 75, p1);
        Student s2 = new Student("Emel", 5001, 80, p2);
        Student s3 = new Student("Burak",5002, 60, p3);
        Student s4 = new Student("Ekin", 5003, 80, p4);
        Student s5 = new Student("Ali", 5005, 70, p5);


        // Creating a Course
        Course c1 = new Course("K129", 3);

        // Adding students to the course
        c1.addStudent(s1);
        c1.addStudent(s2);
        c1.addStudent(s3);
        c1.addStudent(s4);
        c1.addStudent(s5);

        // All Students of K129 are printed on screen.
        infoBlock();
        c1.list();
        infoBlock();

        // Course Capacity increased
        c1.increaseCapacity();

        // Adding the remaining students
        c1.addStudent(s4);
        c1.addStudent(s5);

        // Print the students
        infoBlock();
        c1.list();
        infoBlock();

        // Dropping s5 from the class
        c1.dropStudent(s5);

        // print the Class students
        infoBlock();
        c1.list();
        infoBlock();
        // Print the number of students in the class
        System.out.println("Number of Students in class : " + c1.getCourseName() + " is : " +  c1.getNumberOfStudents());

        // Getting the Best Student's Birthyear
        System.out.println( "Best Student in Course :" + c1.getCourseName() + " is " + c1.getBestStudent().getName() + " and their birthday is : " + c1.getBestStudent().gPersonalData().getBirthDate());
        infoBlock();
        // New Course is created
        Course c2 = new Course("K130");

        // All Students in C1 is enrolled to C2
        Student[] student = c1.getStudents();
        for(int i = 0 ; i < c1.getNumberOfStudents(); i++){
            c2.addStudent(student[i]);
        }

        // printing the Students of C2
        infoBlock();
        c2.list();
        infoBlock();

        // All Students of K129 removed from the course
        c1.clear();

        // Dropping the Student with 5005
        c1.dropStudent(s5);

        // All Students of K130 printed on screen
        infoBlock();
        c2.list();
        infoBlock();

        // Best Student of K130 is dropped from K130
        c2.dropStudent(c2.getBestStudent());
        // Al students of K130 printed
        c2.list();
        // GPA of the youngest studenf of K130 printed
        infoBlock();
        System.out.println("Youngest Student in class : " + c2.getCourseName() + " and its name is : " + c2.getBestStudent().getName() + " GPA is : " + c2.getBestStudent().getGPA());

        // Courses of K129 and K130 printed
        infoBlock();
        c1.list();
        infoBlock();
        c2.list(); 
        infoBlock();
        System.out.println("Thank You...");
    }

    public static void infoBlock(){
        System.out.println("================");
    }
}
