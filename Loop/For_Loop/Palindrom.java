//Write a java program to check whether a number is palindrome or not.

import java.util.*;

public class Palindrom{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int originalNum = num;
		int rem,rev=0;
		for(int i=1;num!=0;i++){
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("The Reverse of "+originalNum+" is: "+rev);
		if(rev==originalNum){
			System.out.println(originalNum+" is "+"palindrom");
		}
		else{
			System.out.println(originalNum+" is "+"not palindrom");
		}

	}
}
