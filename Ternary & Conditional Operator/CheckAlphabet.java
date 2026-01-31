//Q36. Write a Java program to check whether a character is alphabetic or not.

import java.util.*;

public class CheckAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') ) {
            System.out.println("Alphabet");
        }
        else {
            System.out.println("Not Alphabet");
        }
    }
}

