//Q30. Write a java program to enter month number between(1-12) and print number of days in month using if else. How to print the number of days in a given month using if else in java //programming.

import java.util.*;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month number");
        }
        else if (month == 2) {
            System.out.println("28 days");
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 days");
        }
        else {
            System.out.println("31 days");
        }

        sc.close();
    }
}
