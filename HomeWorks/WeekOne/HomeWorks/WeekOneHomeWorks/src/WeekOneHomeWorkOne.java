package WeekOne.HomeWorks.WeekOneHomeWorks.src;


/** @author Erim Serdonmez -- 30/09/2021  
 *  HomeWorkOne.java -- 
 * Write a program that prints out characters in the form of a grid. The program should ask a number N from the user. The grid must be drawn as a square whose edge is N characters. 
 * The outermost characters must be * characters describing a border. Inside the border a checkerboard must be drawn using space and + characters. The top-left corner checkerboard character must be + character.
 *  Below are the outputs for 5 different values of N.
 */

import java.util.Scanner;

public class WeekOneHomeWorkOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Getting input from the user
        System.out.print("Please enter a Number : ");
        int prompt = input.nextInt();
        input.close();

        // Variables
        String firstRow = "";
        String lastRow = "";
        String body = "";

        // Main Loop
        for (int i = 0; i < prompt; i++) {
            if (prompt > 1) {
                lastRow += "*";
            }
            firstRow += "*";

            if (i >= prompt - 2)
                continue;

            body += "*";
            for (int j = 0; j < (prompt - 2); j++) {
                if (i % 2 == 1 && j % 2 == 0) {
                    body += " ";
                } else if (i % 2 == 1 && j % 2 == 1) {
                    body += "+";
                } else if (i % 2 == 0 && j % 2 == 1) {
                    body += " ";
                } else {
                    body += "+";
                }
            }
            body += "*\n";
        }
        // printing the table
        String finalTable = firstRow + "\n" + body + lastRow;
        System.out.println(finalTable);
    }
}
