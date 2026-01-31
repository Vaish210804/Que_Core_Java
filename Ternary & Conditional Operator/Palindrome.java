//Q25. Write a java program to check whether a number is palindrome or not. 


import java.util.*;
public class Palindrome
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int num, rev=0,rem;
		System.out.print("Enter the Number: ");
		num = sc.nextInt();
		int temp = num ;
		rem=num%10;
		rev=rev+rem*100;
		num=num/10;
		rem=num%10;
		rev=rev+rem*10;
		num=num/10;
		rem=num%10;
		rev=rev+rem*1;
		String result = temp==rev ? "It is Palindrome" : "It is not a Palindrome";
		System.out.print(result);
	}
}
		
	