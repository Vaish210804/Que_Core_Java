//Q18. Write a Java program to convert days to years, month and week. 

import java.util.*;

public class DaysConversion{
	public static void main(String x[])
	{
		System.out.println("Enter the no of days: ");
		Scanner sc = new Scanner(System.in);
		int dd = sc.nextInt();
		int yy =dd/365;
		int mm = (dd%365)/30;
		int ww = (dd%30)/7;
		int dd = dd%7;
		System.out.println("Year: "+yy);
		System.out.println("Month: "+mm);
		System.out.println("Weak: "+ww);
		System.out.println("Day: "+dd);
	}
}
		

