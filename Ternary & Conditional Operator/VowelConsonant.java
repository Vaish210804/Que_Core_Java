//Q39. Write a java program to input any alphabet and check whether it is vowel or consonant.


import java.util.*;
public class  VowelConsonant
{
	public static void main(String x[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = scanner.next().charAt(0);
		String result = (ch =='a' || ch =='e' || ch=='i' || ch =='o' || ch == 'u') ? "char is vowel" : "char is consonant";
		System.out.println("Result: "+result);
	}
}