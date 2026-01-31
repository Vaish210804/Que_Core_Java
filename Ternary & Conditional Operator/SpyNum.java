/*Q26. Write a java program to Check Number Is Spy Number or Not.
Example :
A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.
     Input : 1412
     Output : Spy Number 

Explanation :
sum = (1 + 4 + 1 + 2) = 8
product = (1 * 4 * 1 * 2) = 8
since, sum == product == 8
*/

import java.util.*;

public class SpyNum{
	public static void main(String []args){
		System.out.println("Enter the Four digit number: ");
		Scanner sc = new Scanner (System.in);
		int num =sc.nextInt(); 
		int sum=0,pro=1,rem;
		rem=num%10;num/=10;sum+=rem;pro*=rem;
		rem=num%10;num/=10;sum+=rem;pro*=rem;
		rem=num%10;num/=10;sum+=rem;pro*=rem;
		rem=num%10;sum+=rem;pro*=rem;
		System.out.println("Result: "+( sum==pro ? "The number is Spy": "The number is not Spy"));
	}
}
	