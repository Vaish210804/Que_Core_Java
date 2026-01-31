/*Q52. Problem:
Write a Java program using the conditional (ternary) operator to find the middle value among three distinct integers p, q, and r.
Example Input:
p = 10, q = 20, r = 15

Expected Output:
Middle Number: 15
*/

import java.util.Scanner;

public class MiddleNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The value of p: ");
        int p = scanner.nextInt();
	System.out.print("Enter The value of q: ");
        int q = scanner.nextInt();
	System.out.print("Enter The value of r: ");
        int r = scanner.nextInt();
	int max = (p > q) ? ((p > r) ? p: r) : ((q > r) ? q : r);
        int min = (p < q) ? ((p < r) ? p: r) : ((q < r) ? q : r);
        int middle = (p + q + r)- max - min;
	System.out.println("Middle Number: " + middle);
	        
    }
}