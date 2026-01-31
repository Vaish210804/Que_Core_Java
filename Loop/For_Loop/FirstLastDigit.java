// Q18. Write a java program to find the first and last digit of a number.


import java.util.*;

public class FirstLastDigit{
	public static void main(String x[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = s.nextInt();
		int lastDigit = num % 10;
		int FirstDigit=num ; 
		for(; FirstDigit>=10;FirstDigit/=10){
		}
        	System.out.println("First Digit: " + FirstDigit);
       		System.out.println("Last Digit: " + lastDigit);
	}
}