// Q24. Write a java program to check whether a character is uppercase or lowercase alphabet.

import java.util.*;

public class UpperLowerCaseCheck{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character: ");
		char ch = sc.next().charAt(0);
		String result = ch>='a' && ch<='z'? "Lower Case Alphabet": ch>='A' && ch<='Z' ?"Upper Case Alphabe":"Not an Alphabet";
		System.out.println("Result: "+result);
	}
}	