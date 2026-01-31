//Q33. Write a Java program to check whether a triangle is equilateral , isoscale or scalene. 

import java.util.*;
public class EquiIfApp
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sides of Triangle: ");
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		System.out.println("Result: "+((s1==s2 && s2==s3 && s1==s3)?"Triangle is Equilateral Triangle":(s1==s2 || s2==s3 || s1==s3)?"Triangle is isoscale Triangle":"Triangle is scalene Triangle"));

		/*if(s1==s2 && s2==s3 && s1==s3)
		{
			System.out.println("Triangle is Equilateral Triangle");
		}
		else{
			System.out.println("Triangle is not Equilateral Triangle");
		}*/
	}
}
