//Q38. Write a Java program to check whether a year is a leap year or not.

import java.util.*;
public class LeapYear
{
	public static void main(String x[])
	{
		Scanner scanner = new Scanner(System.in);
		int year;
		System.out.println("Enter a year to check whether a given year is leap year or not: ");
		year=scanner.nextInt();
		String result = (year%4==0 && year%100!=0 || year%400==0) ? "Leap year" : "Not a Leap Year";
		System.out.println("Result is : "+result);
	}
}