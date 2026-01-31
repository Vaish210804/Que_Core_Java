//Write a java program to calculate the product of digits in a number.

import java.util.*;

public class ProductOfDigitsInNum{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int originalNum = num;
		int pro =1;
		int rem;
		for(int i=1;num!=0;i++){
			rem=num%10;
			pro=pro*rem;
			num/=10;
		}
		System.out.println("The product of digits of"+originalNum+" is: "+pro);
	}
}