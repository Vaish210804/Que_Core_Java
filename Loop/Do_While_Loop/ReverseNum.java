// Q1. Reverse a given number using a do-while loop.  → Input: 1234 → Output: 4321


import java.util.*;

public class ReverseNum{
	public static void main(String x[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = s.nextInt();
		int rem,rev=0,temp;
		temp = num;
		do{
			rem=temp%10;
			temp=temp/10;
			rev = rev*10+rem;
		}
		while(temp != 0);
			System.out.println("Reverse num: " + rev);

       		
	}
}