/*
Q4. Separate Even and Odd Numbers
Problem Statement
Rearrange an array so that all even numbers come first and odd numbers later.
Two Pointer Explanation
Left pointer finds odd number.
Right pointer finds even number.
Swap them.
Continue until pointers cross.
Logical Operations Used
Modulus operator
Conditional swapping
Pointer movement
*/
import java.util.*;

public class TwoPointerEveOddArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int[] a = new int[size];

        System.out.print("Enter the values in array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("\nBefore rearranging: ");
          for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }

        int left = 0;
        int right = a.length - 1;

        while (left < right) {

            // move left until odd is found
            if (a[left] % 2 == 0) {
                left++;
            }
            // move right until even is found
            else if (a[right] % 2 != 0) {
                right--;
            }
            // swap odd (left) with even (right)
            else {
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
        }

        System.out.print("\nAfter rearranging: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
