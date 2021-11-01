/** @author Erim Serdönmez
 *  WeekOneHomeWorkThree -- OOP
 */
package WeekOne.HomeWorks.WeekOneHomeWorks.src.WeekOneHomeWorkThree;


public class Course {
    
    // Nitelik
    private String name;
    private Student[] students;
    private int capacity;
    private int numberOfStudents = 0;

    // Constructors
    // Default
    Course(String name) {
        this.name = name;
        this.capacity = 40;
        this.students = new Student[this.capacity];
    }

    // Takes a Capacity
    Course(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.students = new Student[this.capacity];
    }


    // Methods
    public int getNumberOfStudents() {
        return this.numberOfStudents;
    }

    public String getCourseName() {
        return this.name;
    }

    public Student[] getStudents() {
        return students;

    }

    public boolean addStudent(Student s1) {
        if(getNumberOfStudents() == this.capacity){
            System.out.println("Not Enough Capacity for \t: " + s1.getName());
            return false;
        }
        if(getNumberOfStudents() > 0){
            for(int i = 0; i < getNumberOfStudents(); i++){
                if(students[i].getID() == s1.getID()){
                    System.out.println(this.name + " Course has Student with the same ID ");
                    return false;
                }
            }
        }
        students[getNumberOfStudents()] = s1;
        System.out.println(s1.toString() + "\thas been added to the Course :\t " + this.name);
        this.numberOfStudents++;
        return true;
    }

    public boolean dropStudent(Student s1) {
        for(int i = 0 ; i < this.numberOfStudents; i++){
            if(s1.getID() == this.students[i].getID()){
                System.arraycopy(this.students, i+1, this.students, i, this.numberOfStudents - i);
                this.numberOfStudents--;
                return true;
            }
        }
        System.out.println("Cannot find \t: " + s1.getName() + " in this Course " + this.name);
        return false;
    }

    public void increaseCapacity() {
        this.capacity += 5;
        Student[] newStudents = new Student[this.capacity];
        for(int i = 0; i < students.length ; i++){
            newStudents[i] = students[i];
        }
        students = newStudents;
    }

    public Student getBestStudent() {
        Student bestStudent = students[0];
        for(int i = 0; i < getNumberOfStudents(); i++){
            if(students[i].getGPA() > bestStudent.getGPA()){
                bestStudent = students[i];
            }
        }
        return bestStudent;
    }

    public Student getYoungestStudent() {
        Student y = this.students[0];
        for(int i = 1 ; i < this.getNumberOfStudents(); i++){
            if(students[i].gPersonalData().getBirthDate().getYear() <= y.gPersonalData().getBirthDate().getYear()){ 
                y = students[i];
            }
        }
        return y;
    }

    public void clear() {
        Student[] newStudents = new Student[this.capacity];
        students = newStudents;
        this.numberOfStudents = 0;
    }

    public void list() {
        if(this.getNumberOfStudents() == 0){
            System.out.println("This named Course \t: " + this.name + " is empty.");
        }else{
            System.out.println("Students in this Course \t: " + this.name + " are;\n");
            for(int i = 0 ; i < getNumberOfStudents(); i++){
                System.out.println(this.students[i].toString());
            }
        }


    }

    public String printCourseInfo(Course c1) {
        return c1.toString();
    }
}
