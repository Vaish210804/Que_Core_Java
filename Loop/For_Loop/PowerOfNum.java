// Q16. Write a java program to find power of a number.

import java.util.Scanner;
public class PowerOfNum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Base: ");
		int b = sc.nextInt();
		System.out.println("Exponent: ");
		int exp=sc.nextInt();
		int result = 1;
		
		for(int i=1;i<=exp;i++){
			result*=b;
		}
		System.out.println("Result: "+result);
	}
}