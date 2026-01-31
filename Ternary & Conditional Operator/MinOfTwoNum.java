//Q45. Write a java program to find the minimum between two numbers. 

import java.util.Scanner;

public class MinOfTwoNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the value of num1: ");
        int num1 = scanner.nextInt();
	System.out.print("Please enter the value of num2: ");
        int num2 = scanner.nextInt();
	System.out.print("Result: "+(num1>num2?"Num2 is Minimum":"Num1 is Minimum"));
	        
    }
}