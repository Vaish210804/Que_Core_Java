//Q36. Write a Java program to check whether a character is alphabetic or not.


import java.util.*;
public class CharApp
{
	public static void main(String x[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character: ");	
		char ch = scanner.next().charAt(0);
		String result = (ch>='A' && ch<='Z')||(ch>='a' && ch<='z') ? "is alphabet" : (ch >='0' && ch <='9') ? "is Digit" : "is special char";
		System.out.println("Result: "+ch+" "+result);
	}
}