//Q32. Write a Java program to accept 3 angles of triangle and check whether a triangle is valid or not.

import java.util.*;
public class TriangleApp
{
	public static void main(String x[])
	{
		Scanner scanner = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the value of angle of triangle respectively: ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		String result = a+b+c==180 ? "Triangle is valid" : "Triangle is invalid";
		System.out.println("Result: "+ result);
	}
}