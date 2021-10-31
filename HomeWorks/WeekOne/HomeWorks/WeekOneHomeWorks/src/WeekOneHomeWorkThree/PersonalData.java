/** @author Erim Serdönmez
 *  WeekOneHomeWorkThree -- OOP
 */
package WeekOne.HomeWorks.WeekOneHomeWorks.src.WeekOneHomeWorkThree;

import java.time.LocalDate;

public class PersonalData {
    // Nitelikler
    private LocalDate birthDate;
    private String address;
    private long ssn;

    //Constructor Default
    PersonalData(LocalDate birthDate, long ssn){
        this.birthDate = birthDate;
        this.ssn = ssn;
    }

    // Constructor uses int and long value
    PersonalData(int year, int month,int day,long ssn){
        this.birthDate = LocalDate.of(year, month, day);
        this.ssn = ssn;
    }
}
