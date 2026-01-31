// Q15. Write a java program to print all ASCII characters with their values.


import java.util.Scanner;
public class AsciiChWithValues{
	public static void main(String args[]){
		for(int i=0;i<=255;i++){
			System.out.println(i+" = "+ (char) i);
		}
	}
}