/*Q49. Given a score out of 100, print Excellent (≥90), Good (≥75), Average (≥50), Poor (< 50)
— using nested ternary operators.*/

import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter students Score: ");
        int marks = scanner.nextInt();
	System.out.print("Result: "+(marks>=90?"Excellent": marks>=75?"Good":marks>=50? "Pass": "Poor"));
	        
    }
}