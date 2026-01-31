//Q43. Write a java program to accept two integers and check whether they are equal or not.

import java.util.Scanner;

public class CheckEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the value of num1: ");
        int num1 = scanner.nextInt();
	System.out.print("Please enter the value of num2: ");
        int num2 = scanner.nextInt();
	System.out.print("Result: "+(num1==num2?"Equal":"Not Equal"));
	        
    }
}