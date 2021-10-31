/** @author Erim Serdönmez
 *  WeekOneHomeWorkThree -- OOP
 */
package WeekOne.HomeWorks.WeekOneHomeWorks.src.WeekOneHomeWorkThree;

public class Student {
    String name;
    long id;
    double gpa;
    PersonalData pd;

    Student(String name,long id,double gpa,PersonalData pd){
        this.name = name;
        this.id = id;
        this.gpa = gpa;
        this.pd = pd;

    }

    public String getName(){
        return this.name;
    }

    public long getID(){
        return this.id;
    }

    public double getGPA(){
        return this.gpa;
    }

    public PersonalData gPersonalData(){
        return this.pd;
    }

    public String printInfo(Student s1){
        String m1 = "Name \t: " + s1.getName() +"\nID \t: " + s1.getID() + "\nGPA \t: "+ s1.getGPA();
        return m1;
    }
}
