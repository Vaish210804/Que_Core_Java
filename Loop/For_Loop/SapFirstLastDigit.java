//Q20. Write a java program to swap first and last digits of a number.

import java.util.*;

public class SapFirstLastDigit{
	public static void main(String x[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = s.nextInt();
		int rem,sum=0,temp;
		temp = num;
		for(int i=1 ; i<=num ; i++){
			rem=temp%10;
			temp=temp/10;
			sum = sum*10+rem;
		}
        	System.out.println("Before Swapping num: " + num);
       		System.out.println("After Swapping num: " + sum);
		}
}