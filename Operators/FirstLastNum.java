//Q22. Write a program to find the first and last digit of a number without using a loop in three digits

import java.util.*;

public class FirstLastNum{
	public static void main(String []args){
		System.out.println("Enter the three digit number: ");
		Scanner sc = new Scanner (System.in);
		int num =sc.nextInt(); 
		int first,last;
		first = num/100;
		last = num%10;
		System.out.println(" First digit of a number is: "+first);
		System.out.println(" Last digit of a number is: "+last);
	}
}
		

