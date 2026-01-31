//Write a java program to print all alphabets from a to z. - using while loop
import java.util.*;
public class PrintAlpha{
	public static void main(String x[]){
		int i=97;
		while(i<=122){
			char ch = (char) i;
			System.out.println(ch);
			i++;
		}
	}
}




/*
public class AlphabetsAtoZ {
    public static void main(String[] args) {

        char ch = 'a';  // Starting alphabet

        while (ch <= 'z') {
            System.out.println(ch);
            ch++;  // Move to next character
        }
    }
}

*/