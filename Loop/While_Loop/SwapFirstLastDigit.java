//Q20. Write a java program to swap first and last digits of a number.


import java.util.*;

public class SwapFirstLastDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, count, x, temp, first, last, mid, z;

        System.out.println("Enter a number:");
        n = sc.nextInt();

        temp = n;

        // STEP 1: Count number of digits
        count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }

        System.out.println("Number of digits = " + count);

        // STEP 2: Find x = 10^(count-1)
        x = 1;
        while (count > 1) {
            x = x * 10;
            count--;
        }

        System.out.println("x factor = " + x);

        // STEP 3: Extract first, last, middle digits
        n = temp;

        last = n % 10;
        first = n / x;
        mid = (n % x) / 10;

        System.out.println("first=" + first + " mid=" + mid + " last=" + last);

        // STEP 4: Swap first and last digit
        z = last * x + mid * 10 + first;

        System.out.println("After swap of first and last digit = " + z);

        sc.close();
    }
}
