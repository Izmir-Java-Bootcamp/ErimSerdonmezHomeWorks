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
        System.out.println("=================");
        c1.list();
        System.out.println("==================");

        // Course Capacity increased
        c1.increaseCapacity();

        // Adding the remaining students
        c1.addStudent(s4);
        c1.addStudent(s5);

        // Print the students
        System.out.println("===================");
        c1.list();
        System.out.println("===================");

        // Dropping s5 from the class


        // print the Class students

        // Print the number of students in the class
        System.out.println(c1.getNumberOfStudents());

    }
}
