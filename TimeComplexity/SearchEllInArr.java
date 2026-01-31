/*Q2. Write a Java program to search a given element in an array using linear search.
Explanation
Compare each element with the target.
Stop if found.


Time Complexity
Best case: O(1)
Worst case: O(n)
Example : Array: {5, 8, 2, 9}
	   Search: 2  —->  Element found at index 2
*/

import java.util.*;
public class SearchEllInArr{
		public static void main(String x[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.print("Enter the Elements of array: ");
		for(int i=0; i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.print("Enter the Target: ");
		int target = sc.nextInt();
		int I = 0;
		Boolean flag=false;
		for(int i=0; i<a.length;i++){
				if(a[i]==target){
					I=i;
					flag = true;
					break;
				}
		}
		if(flag){
			System.out.print("Element found at index "+I); 
		}
		else{
			System.out.print("Element Not found in the array."); 
		}
	}
}

		