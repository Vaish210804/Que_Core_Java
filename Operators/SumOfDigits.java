// Q20. Write a Java program and compute the sum of an integer's digits.

import java.util.*;

public class SumOfDigits{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int rem,sum=0;
		System.out.println("Enter The Three Digit number: ");
		int num = sc.nextInt();
		rem=num%10;
		num=num/10;
		sum=sum+rem;
		rem=num%10;
		num=num/10;
		sum=sum+rem;
		rem=num%10;
		sum=sum+rem;		
		System.out.println("Sum of the digits is: "+sum);
	}
}
