//Q2. Count the number of digits in a given number using a do-while loop.	→ Input: 12345 → Output: 5


import java.util.*;

public class CountDigitNum{
	public static void main(String x[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		long num = s.nextLong();
		int count =0;
		long temp = num;
		do{
			
			temp=temp/10;
			count++;
		}
		while(temp != 0);
			System.out.println("Number of digits: " + count);

       		
	}
}