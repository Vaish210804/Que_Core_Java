//Q18. Write a Java program to convert days to years, month and week. 

import java.util.*;

public class DaysApp{
	public static void main(String x[])
	{
		System.out.println("Enter the no of days: ");
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int yy =d/365;
		int mm = (d%365)/30;
		int ww = (d%30)/7;
		int dd = d%7;
		System.out.println("Year: "+yy);
		System.out.println("Month: "+mm);
		System.out.println("Weak: "+ww);
		System.out.println("Day: "+dd);
	}
}
		

