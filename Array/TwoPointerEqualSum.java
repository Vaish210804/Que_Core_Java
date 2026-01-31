/*Q2. Count Pairs With Equal Sum from Ends
Problem Statement
Given an integer array, count how many pairs from both ends have equal sum.
Two Pointer Explanation
Place one pointer at the beginning and one at the end.
Calculate the sum of both elements.
If sum matches required condition, increase count.
Move pointers accordingly.
Logical Operations Used
Addition
Comparison operators
Conditional branching
*/

import java.util.*;
public class TwoPointerEqualSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int[] a = new int[size];

        System.out.print("Enter the values in array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
	System.out.print("\nInput array is: ");
	for(int i=0; i<a.length ; i++){
		System.out.print(a[i]+" ");
	}
	int TargetSum=a[0] + a[a.length - 1];
       	int count =0;
        for (int i = 0; i < a.length / 2; i++) {
		int sum = a[i]+a[a.length - 1 - i];
		if (sum == TargetSum) {
                count++;
            	}
        }

       System.out.print("\nCount of pairs with equal sum = " + count);
    }
}
