//Write a java program to calculate the sum of digits in a number.

import java.util.*;

public class SumOfDigitsInNum{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int sum =0;
		int rem;
		for(int i=1;num!=0;i++){
			rem=num%10;
			sum=sum+rem;
			num/=10;
		}
		System.out.println("The sum of digits in"+num+" is: "+sum);
	}
}
			