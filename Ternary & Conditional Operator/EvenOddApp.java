//Q31. Write a Java program to check whether a number is even or odd. 


import java.util.*;
public class EvenOddApp
{
	public static void main(String x[])
	{
		Scanner scanner = new Scanner(System.in);
		int num;
		System.out.println("Enter a number: ");
		num=scanner.nextInt();
		//String result = num%2==0 ? "Given num is Even" : "Given Num is odd";
		System.out.println("Result: "+( num%2==0 ? "The given num is Even" : "The given Num is odd"));
	}
}