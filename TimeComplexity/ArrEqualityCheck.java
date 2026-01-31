/*Q10. Write a Java program to check whether two arrays are equal.
Explanation
Check size first.
Compare each element one by one.
Time Complexity
O(n)
Example :- Array1: {1, 2, 3}
	       Array2: {1, 2, 3}
	       Output :- Arrays are equal
*/

import java.util.*;
public class ArrEqualityCheck{
		public static void main(String x[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the size of array1: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.print("Enter the Elements of array1: ");
		for(int i=0; i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.print("Enter the size of array2: ");
		int size1 = sc.nextInt();
		int b[]=new int[size1];
		System.out.print("Enter the Elements of array2: ");
		for(int i=0; i<b.length;i++){
			b[i]=sc.nextInt();
		}
		System.out.print("\nArray1 : ");
		for(int i=0; i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.print("\nArray2 : ");
		for(int i=0; i<b.length;i++){
			System.out.print(b[i]+" ");
		}
		boolean equal =true;
		if(a.length!=b.length){
			equal =false;
		}
		else{
			for(int i=0; i<b.length;i++){
					if(a[i]!=b[i]){
						equal = false;
						break;
					}
			}
		}
		if(equal){
			System.out.print("\nArrays are equal");
		}
		else{
			System.out.print("\nArrays are not equal");
		}
	}
}

