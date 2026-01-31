//Q50. Given a number, print Perfect Square if its square root is an integer, otherwise Not Perfect Square — using ternary operators.

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = scanner.nextInt();
	double sq =Math.sqrt(num);
	System.out.print("Result: "+((sq == (int)sq) ? "Perfect Square" : "Not Perfect Square"));
	//System.out.print("Result: "+( x%1==0  ? "Perfect Square" : "Not Perfect Square"));
	        
    }
}