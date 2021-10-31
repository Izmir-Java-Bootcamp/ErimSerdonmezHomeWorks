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
}
