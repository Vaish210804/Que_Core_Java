//Q48. Given a student’s score, print Pass if it’s 40 or above, otherwise print Fail.

import java.util.Scanner;

public class PassApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter students Score: ");
        int marks = scanner.nextInt();
	System.out.print("Result: "+(marks>=40?"Pass":"Fail"));
	        
    }
}