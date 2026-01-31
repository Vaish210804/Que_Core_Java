/*Q51. Problem: 
Take two integers m and n. Use the ternary operator to print whether the absolute difference between them is greater than 10 or not.
Example Input:
m = 25, n = 12
*/



import java.util.Scanner;

public class DiffBtweenTowNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of m: ");
        int m = scanner.nextInt();
	System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
	System.out.print("Result: "+(m-n>10?"The absolute difference between them is greater than 10":"The absolute difference between them is Not greater than 10"));
	        
    }
}