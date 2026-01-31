//Q4. Check whether a number is a palindrome using a do-while loop.	→ Input: 121 → Output: Palindrome

import java.util.*;

public class Palindrome {
	public static void main(String x[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		long num = s.nextLong();
		long rem,rev=0,temp;
		temp = num;
		do{
			rem=temp%10;
			temp=temp/10;
			rev = rev*10+rem;
		}
		while(temp != 0);
		if(num==rev){
			System.out.println("Yes, It's a Palinfrom");
		}
		else{
			System.out.println("No, It's Not a Palinfrom");
		}

	}
}