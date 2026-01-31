// Write a java program to find the sum of all natural numbers between 1 to n.

import java.util.*;
public class SumNaturalNum{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		long num = sc.nextInt();
		int sum=0;
		int i=1;
		System.out.println("The sum of Natural numbers in between "+i+" and "+num+" is: ");
		while(i<=num){
			sum +=i;
			i++;
		}
		System.out.println(sum);

	}
}