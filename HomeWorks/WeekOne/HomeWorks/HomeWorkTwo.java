/** @author Erim Serdonmez -- 30/09/2021
 *  HomeWorkTwo.java -- Write a program that requests a pattern string from the user. The pattern includes wild card character * in addition to any other //characters. Each occurrence of the wild chard character represents a sequence of any characters. After getting the pattern, the program continuously requests the user to enter a string and checks if the pattern occurs in the string using a method public static boolean occursIn(String pattern, String str). The program will exit when the user enters exit.
*/
package WeekOne.HomeWorks;

import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the pattern which you'll like to find in a string (example: s*c*l) : ");
        String pattern = input.nextLine();

        // Main Loop
        while (true) {
            System.out.println(
                    "Please enter the String which you'll use the pattern in (You can exit the program by writing 'exit'...) :");
            String answer = input.nextLine();
            

            // exiting the program if user enters 'exit'
            if (answer.equals("exit")) {
                System.out.println("Exiting the program...Thank you...");
                input.close();
                break;
            }
            if (occurance(pattern, answer)) {
                System.out.println(pattern + " occurs in " + answer);
            } else {
                System.out.println(pattern + " Does not occur in " + answer);
            }

        }

    }

    // Writing the Method for the occurance
    public static boolean occurance(String pattern, String answer) {
        String p = "";
        for (int i = 0; i < pattern.length(); i++) {
            if (pattern.charAt(i) != ('*')) {
                p += pattern.charAt(i);
            }
        }

        int count = 0;
        for (int i = 0; i < p.length(); i++) {
            char letter = p.charAt(i);
            for (int j = 0; j < answer.length(); j++) {
                if (answer.charAt(j) == (letter)) {
                    count++;
                    answer = answer.substring(j + 1);
                }
            }
        }

        if (count >= p.length()) {
            return true;
        } else {
            return false;
        }

    }
}
