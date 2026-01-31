//Q34. Write a Java program to check whether a number is positive , negative or zero.

import java.util.*;
public class PosNegNum
{
	public static void main(String x[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = scanner.nextInt();
		String result = num > 0 ? "Positive" : num<0 ? "Negative" : "Zero";
		System.out.println("Result is : "+result);
	}
}