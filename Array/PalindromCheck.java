/*Q4. Check whether the given array is a palindrome.
Input: {1, 2, 3, 2, 1}
Output: true


Explanation:
 A palindrome reads the same forward and backward.
 Forward: 1 2 3 2 1
 Backward: 1 2 3 2 1
 Since both are the same, the array is a palindrome.
*/

import java.util.*;
public class PalindromCheck {
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		int b[]=new int[size];
		System.out.print("Enter the value in array: ");
		for(int i=0; i<a.length; i++){
			a[i]=sc.nextInt();
		}
		System.out.print("Forward array is: ");
		for(int i=0; i<a.length ; i++){
			b[i]=a[i];
		}
		for(int i=0; i<b.length ; i++){
			System.out.print(b[i]+" ");
		}

		for(int i=0 ; i<a.length/2 ; i++){
			 int temp = a[i];
    			a[i] = a[(a.length - 1) - i];
    			a[(a.length - 1) - i] = temp;
		}
		System.out.print("\nBackward array is: ");
		for(int i=0; i<a.length ; i++){
			System.out.print(a[i]+" ");
		}
		boolean PalindromeCheck = false;
		for(int i=0; i<a.length ; i++){
			if(a[i]!=b[i]){
				PalindromeCheck=true;
				break;
			}
		}
		if(PalindromeCheck){
			System.out.print("\nGiven array is not a palindrome.");
		}
		else{
			System.out.print("\nGiven array is a palindrome.");

		}

	}
}