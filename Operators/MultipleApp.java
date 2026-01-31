/* 
Q30. Write a Java program to check whether a number is a multiple of both 3 and 5 using the logical AND (&&) operator.
Input: 15
Output: Multiple of both 3 and 5
*/

import java.util.*;

public class MultipleApp{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		System.out.println("Result: "+(num%3==0 && num%5==0? "The number is a multiple of both 3 and 5": "The number is not a multiple of both 3 and 5"));
	}
}