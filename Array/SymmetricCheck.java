/*Q10. Check Whether Array Is Symmetric
Problem Statement
Check whether an integer array is symmetric (mirror-equal).
Two Pointer Explanation
Left pointer and right pointer compare values.
If all pairs match → symmetric.


Logical Operations Used
Comparison


Loop break conditions
Boolean logic
*/


import java.util.*;
public class SymmetricCheck {
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int[] a = new int[size];

        System.out.print("Enter the values in array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
	int left =0,right=a.length-1;
	Boolean IsSymmetric=true;
	while(left<right){
		if(a[left]!=a[right]){
			IsSymmetric = false;
			break;
		}
		left++;
		right--;
        }
		if(IsSymmetric){
			System.out.print("The array is Symmetric. "); }
		else{
			System.out.print("The array is not Symmetric. "); }

      
    }
}

