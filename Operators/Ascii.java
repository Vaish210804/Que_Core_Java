//Q16. Write a Java program to print the ASCII value of a given character.


import java.util.*;
public class Ascii
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		char ch;
		System.out.printf("Enter a char for which you want to know ascii value: ");
		ch = xyz.next().charAt(0);
		int asciivalue = (int) ch;//used Type casting method 
		System.out.printf("ASCII  value of a above char is:%d\n",asciivalue);
	}
}