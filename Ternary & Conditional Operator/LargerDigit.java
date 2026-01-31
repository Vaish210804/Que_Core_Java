//Q54. Take a three-digit number and print the larger digit between the first and last digit using the ternary operator.


import java.util.Scanner;

public class LargerDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Three digit num: ");
        int num = scanner.nextInt();
	int first = num/100;
	int last = num%10;
	int larger = (first > last) ? first : last;
        System.out.println("Larger Digit: " + larger);
    }
}	