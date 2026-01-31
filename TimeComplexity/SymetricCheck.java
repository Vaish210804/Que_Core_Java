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

public class SymetricCheck{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		int a[]=new int[5];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		boolean IsSymmetric = true;
		for(int i=0;i<a.length/2;i++){
			if(a[i]!=a[a.length-1-i]){
				IsSymmetric=false;
				break;
			}
		}
		if(IsSymmetric){
			System.out.print("Array is Symmetric");
		}
		else{
			System.out.print("Array is not Symmetric");
		}
	}
}
