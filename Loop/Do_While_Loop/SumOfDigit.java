//Q3. Find the sum of digits of a number using a do-while loop.	→ Input: 9876 → Output: 30


import java.util.*;

public class SumOfDigit{
	public static void main(String x[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		long num = s.nextLong();
		long rem,sum=0,temp;
		temp = num;
		do{
			rem=temp%10;
			temp=temp/10;
			sum +=rem;
		}
		while(temp != 0);
			System.out.println("Sum of Digit in Num : " + sum);

       		
	}
}