/*Q53. Take percentage and income of a student:
If percentage >= 75 AND income < 200000, print "Eligible"


Else "Not Eligible"
*/

import java.util.Scanner;

public class IncomeEligibilityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Percentage of a student: ");
        int per = scanner.nextInt();
	System.out.print("Enter the Income of a student: ");
        int in = scanner.nextInt();
	System.out.print("Result: "+(per>=75 && in<200000 ? "Eligible": "Not Eligible"));
	        
    }
}