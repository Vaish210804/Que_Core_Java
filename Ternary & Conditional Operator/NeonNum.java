/*Q24. Write a java program to check whether a number is neon or not.
Input : 9
Output : Neon Number Explanation: square is 9*9 = 81 and the sum of the digits of the square is 9.
*/

import java.util.*;
public class NeonNum
{
	public static void main(String x[])
	{
		Scanner scanner = new Scanner(System.in);
		int num,sum=0,rem,sq,temp;
		System.out.println("Enter a number: ");
		num=scanner.nextInt();
		sq=num*num;
		temp=sq;
		rem=temp%10;
		temp=temp/10;
		sum=rem+temp;
		System.out.println("Result: "+( sum==num ? "The given num is Neon": "The given Num is not Neon"));
	}
}