//Write a java program to print all natural numbers from 1 to n. using while loop

import java.util.*;
public class NaturalNum{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		long num = sc.nextInt();
		int i=1;
		System.out.println("The Natural numbers in between "+i+" and "+num+" are: ");
		while(i<=num){
			System.out.println(i);
			i++;
		}
	}
}