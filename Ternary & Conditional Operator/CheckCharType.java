//Q40. Write a java program to input any character and check whether it is alphabet, digit or special character.

import java.util.*;

public class CheckCharType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') ) {
            System.out.println("Alphabet");
        }
	 else if(ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        }
        else {
            System.out.println("special character");
        }
    }
}
