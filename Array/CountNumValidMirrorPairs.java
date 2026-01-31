/*Q6. Count Number of Valid Mirror Pairs
Problem Statement
Count how many pairs from start and end have equal values.
Two Pointer Explanation
Compare elements from both ends.
If equal, increase count.
Move pointers inward.
Logical Operations Used
Equality check
Counter increment
Pointer logic
*/



import java.util.*;
public class CountNumValidMirrorPairs{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int[] a = new int[size];

        System.out.print("Enter the values in array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
	int count=0;

        for (int i = 0; i < a.length / 2; i++) {
            if (a[i] == a[a.length - 1 - i]) {
             
		count++;
            }
        }
	System.out.print("Total Number of Valid Mirror Pairs are : "+count);

      
    }
}

		