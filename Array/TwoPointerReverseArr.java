/*
Q3. Reverse an Integer Array In-Place
Problem Statement
Reverse an integer array without using extra space.
Two Pointer Explanation
Start pointer at index 0, end pointer at n-1.
Swap elements at both pointers.
Move pointers toward the center.
Logical Operations Used
Swap using temporary variable
Loop termination condition
Index manipulation

*/

import java.util.*;
public class TwoPointerReverseArr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int[] a = new int[size];

        System.out.print("Enter the values in array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
	System.out.print("\nBefore Swapping the array is: ");
	for(int i=0; i<a.length ; i++){
		System.out.print(a[i]+" ");
	}
    
        for (int i = 0; i < a.length / 2; i++) {
		int temp = a[i];
		a[i]=a[a.length - 1 - i];
		a[a.length - 1 - i]=temp;		
        }
	System.out.print("\nAfter Swapping the array is: ");
	for(int i=0; i<a.length ; i++){
		System.out.print(a[i]+" ");
	}
       }
}
