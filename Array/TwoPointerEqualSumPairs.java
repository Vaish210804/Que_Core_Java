+/*Q5. Find Pair With Given Sum (Sorted Array)
Problem Statement
Given a sorted integer array and a target sum, check whether a pair exists whose sum equals the target.
Two Pointer Explanation
One pointer at start, one at end.


If sum is smaller → move start pointer.


If sum is larger → move end pointer.


Logical Operations Used
Arithmetic addition


Conditional comparisons


Loop logic
*/

import java.util.*;
public class TwoPointerEqualSumPairs {
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
	System.out.print("\nEnter the Target sum: ");
	int TargetSum= sc.nextInt();
       	System.out.print("\nList of pair exists whose sum equals the target = ");
	int left = 0;
	int right = a.length - 1;
	boolean found = false;

	while (left < right) {
    		int sum = a[left] + a[right];

    		if (sum == TargetSum) {
        		System.out.println("Yes,Pair found: {" + a[left] + ", " + a[right] + "}");
        		found = true;
        		break;
    		} 
    		else if (sum < TargetSum) {
        		left++;
    		} 
    		else {
        		right--;
    		}
	}

		if (!found) {
    			System.out.println("No pair found");
		}
    }
}
