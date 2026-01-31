//Q27. Write a Java program that takes an alphabet character and toggles its case using ASCII values and operators.
//       Example: a → A, Z → z.
// 'a' to 'z' = 97 to 122-----------> a--->A== 97-68=32 so to covert lower to upper subtract 32 and to convert upper to lower add 32 
// 'A' to 'Z' = 65 to 90------------> z--->Z==122-90=32

import java.util.*;

public class TogglesAscii{
	public static void main(String []args){
		System.out.println("Enter the Character: ");
		Scanner sc = new Scanner (System.in);
		char ch =sc.next().charAt(0); 
		if(ch >= 'a' && ch <= 'z') {
    			ch = (char)(ch - 32);  
		}
		else if(ch >= 'A' && ch <= 'Z') {
    			ch = (char)(ch + 32);  
		}
		else {
            		System.out.println("Not an alphabet!");
            		return;
        	}

		System.out.println("Toggled case: " + (char)ch);
    }
}
	