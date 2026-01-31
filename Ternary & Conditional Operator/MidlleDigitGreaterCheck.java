/*Q55. Take a three-digit number and print whether the middle digit is greater than the sum of the first and last digits using the ternary operator.

Example:
Input: num = 572 → Middle digit 7 vs (5+2)=7 → Equal or Not Greater


Input: num = 853 → Middle digit 5 vs (8+3)=11 → Not Greater*/



import java.util.Scanner;

public class MidlleDigitGreaterCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Three digit num: ");
        int num = scanner.nextInt();
	int first = num/100;
	int last = num%10;
	num=num/10;
	int middle=num%10;
	String larger = (first+last)>middle ? "Greater" : "Not Greater";
        System.out.println("Larger Digit: " + larger);
    }
}