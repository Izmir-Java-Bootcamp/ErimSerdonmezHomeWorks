/** @author Erim Serdönmez
 *  WeekOneHomeWorkThree -- OOP
 */
package WeekOne.HomeWorks.WeekOneHomeWorks.src.WeekOneHomeWorkThree;

import java.time.LocalDate; 

public class Main {
    public static void main(String[] args) {
        LocalDate specialDate = LocalDate.of(1990, 03, 27);
        PersonalData p1 = new PersonalData(specialDate, 555);
        Student s1 = new Student("Erim", 55522222, 44244, p1);

        System.out.println(s1.printInfo(s1));

    }
}
