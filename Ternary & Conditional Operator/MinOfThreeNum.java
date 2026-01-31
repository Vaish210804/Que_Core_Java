//Q46. Write a java program to find a minimum between three numbers.  

import java.util.Scanner;

public class MinOfThreeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the value of num1: ");
        int num1 = scanner.nextInt();
	System.out.print("Please enter the value of num2: ");
        int num2 = scanner.nextInt();
	System.out.print("Please enter the value of num3: ");
        int num3 = scanner.nextInt();
	int min = (num1<=num2 && num1<=num3)?num1:(num2<=num1 && num2<=num3)?num2:num3;
	System.out.print("Min num is: "+min);	
    }
}