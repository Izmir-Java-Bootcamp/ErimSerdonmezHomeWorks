package WeekOne.HomeWorks.WeekOneHomeWorks.src.WeekOneHomeWorkThree;

public class Course {
    String name;
    Student s1;
    int capacity;
    int numberOfStudents;

    Course(String name){
        this.name = name;
        this.capacity = 40;
    }
    Course(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
    }
}
