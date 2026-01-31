/*Q7. Remove Duplicate Pairs From Sorted Array
Problem Statement
Remove duplicate mirror pairs from a sorted array.
Two Pointer Explanation
Compare values at both ends.
If duplicates found, move pointers to skip duplicates.


Logical Operations Used
Comparison operators


Conditional pointer skipping
Loop control


Input :- Array = [1, 1, 2, 3, 3, 4, 4]
Output :- Unique Mirror Pairs: (1, 4) , (2, 3)

*/


import java.util.*;
public class RemoveDuplicatePairs{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int[] a = new int[size];

        System.out.print("Enter the values in array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
	Arrays.sort(a);
	int left =0,right=a.length-1;
	System.out.print("Unique Mirror Pairs: ");
	while(left<right){
		System.out.print("(" + a[left] + ", " + a[right] + ") ");
		int leftVal = a[left];
		int rightVal = a[right] ;
		// skip duplicates on left
            	while (left < right && a[left] == leftVal) {left++;}

            	// skip duplicates on right
            	while (left < right && a[right] == rightVal) {right--;} 
        }
      
    }
}

