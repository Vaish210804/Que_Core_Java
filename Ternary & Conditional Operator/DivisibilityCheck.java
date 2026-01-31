//Q35. Write a Java program to check whether a number is divisible by 5 and 11 or not. 

import java.util.*;
public class DivisibilityCheck
{
	public static void main(String x[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = scanner.nextInt();
		String result =num%5==0 && num%11==0?"is divisible by 5 and 11":  "is not divisible by 5 and 11" ;
		System.out.println("Result: "+num+" "+result);
	}
}