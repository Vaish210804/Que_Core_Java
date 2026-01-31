//Write a java program to find the sum of all odd numbers between 1 to n.

import java.util.*;

public class PrintSumOfEvenNum{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		long num = sc.nextInt();
		int i=1;
		int sum =0;
		System.out.println("The sum of Even number in between "+i+" and "+ num+" is: ");
		while(i<=num){
			if(i%2==0){
				sum +=i;
			}
			i++;
		}
		System.out.println(sum);
	}
}