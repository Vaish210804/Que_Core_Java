/*Q29. Given two integers, write a Java program to find the quotient and remainder using only arithmetic operators.
Input: dividend = 20, divisor = 3 Output: Quotient = 6, Remainder = 2
 
*/

import java.util.*;
public class QueRemNum
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("dividend: ");
		int dividend = sc.nextInt();
		System.out.println("divisor: ");
		int divisor = sc.nextInt();
		int que = dividend/divisor;
		int rem = dividend%divisor;
		System.out.println("Quotient= "+que);
		System.out.println("Remainder= "+rem);
	}
}