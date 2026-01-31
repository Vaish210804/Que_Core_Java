// Write a java program to print all natural numbers in reverse (from n to 1). using a while loop.

import java.util.*;
public class ReverseNaturalNum{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		long num = sc.nextInt();
		long i=num;
		/*long temp = num+1;
		System.out.println("The Natural numbers in between "+i+" and "+num+" are: ");
		while(i<=num){
			temp -= 1;
			System.out.println(temp);
			i++;
		}*/
		System.out.println("The Natural numbers in between "+i+" and "+num+" are: ");
		while(i>=1){
			System.out.println(i);
			i--;
		}
	}
}