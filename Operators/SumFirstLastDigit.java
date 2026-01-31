/*Q23. Write a program to calculate the sum of the first and last digit of a number without using a loop.
Input : 123
Output : 4
*/

import java.util.*;

public class SumFirstLastDigit{
	public static void main(String []args){
		System.out.println("Enter the three digit number: ");
		Scanner sc = new Scanner (System.in);
		int sum =0 ;
		int num =sc.nextInt(); 
		int first,last;
		first = num/100;
		sum=sum+first;
		last = num%10;
		sum = sum+last ;
		System.out.println(" Sum of the first and last digit of a number is: "+sum);
		}
}