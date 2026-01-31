/*Q24. Write a java program to check whether a number is neon or not.
Input : 9
Output : Neon Number Explanation: square is 9*9 = 81 and the sum of the digits of the square is 9.
*/

import java.util.*;
public class NeonNum
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        int sq = num * num;
        int sum = 0;

        // Sum of digits of the square
        int temp = sq;
        while(temp > 0)
        {
            sum += temp % 10;
            temp /= 10;
        }

        if(sum == num)
            System.out.println("Neon Number");
        else
            System.out.println("Not a Neon Number");
    }
}
