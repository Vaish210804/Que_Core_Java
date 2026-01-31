/* Q21. Write a Java program to reverse a number without using a loop.
Input a number: 123 Reverse number: 321
*/

import java.util.*;

public class ReverseTheNum{
	public static void main(String []args){
		System.out.println("Enter the three digit number: ");
		Scanner sc = new Scanner (System.in);
		int num =sc.nextInt(); 
		int rev =0,rem;
		rem=num%10;
		rev=rev+rem*100;
		num=num/10;
		rem=num%10;
		rev=rev+rem*10;
		num=num/10;
		rem=num%10;
		rev=rev+rem;
		System.out.println("Reverse num: "+rev);
	}
}
		


		
		