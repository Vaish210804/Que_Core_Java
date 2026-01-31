// Write a java program to print a multiplication table of any number.


import java.util.*;

public class MultiTableOfNum{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		long num = sc.nextInt();
		int i=1;
		System.out.println("The multiplication table of "+num+" is: ");
		while(i<=10){
			System.out.println(num*i);
			i++;
		}
	}
}