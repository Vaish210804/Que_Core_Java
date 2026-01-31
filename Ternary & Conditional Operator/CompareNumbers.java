/*Q36. Compare two numbers: greater, smaller, or equal.
 
    Input: Two integers
    Logic: if-else if
    Output: Greater, smaller, or equal.*/


import java.util.*;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("First number is greater");
        }
        else if (a < b) {
            System.out.println("First number is smaller");
        }
        else {
            System.out.println("Both numbers are equal");
        }

        sc.close();
    }
}

