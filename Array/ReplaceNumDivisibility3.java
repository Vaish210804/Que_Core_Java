/*Q1. Replace All Elements Divisible by 3 with -1.
Input: [3, 6, 7, 9, 10]
Output: [-1, -1, 7, -1, 10]


Explanation:
Elements divisible by 3 are 3, 6, 9. These are replaced with -1. Other elements remain unchanged.
*/

import java.util.*;
public class ReplaceNumDivisibility3{
		public static void main(String x[]){
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the size of array: ");
			int size = sc.nextInt();
			int a[] = new int[size];
			System.out.print("Enter the elements in array: ");
			for(int i=0;i<a.length;i++){
				a[i]=sc.nextInt();
			}
			System.out.print("Input Array is: ");
			for(int i=0;i<a.length;i++){
				System.out.print(a[i]+" ");
			}
			// Negative num replace with zero logic 
			for(int i=0;i<a.length;i++){
				if( a[i]%3==0){
					a[i]=-1;
				}
			}
			System.out.print("\nArray after replacing all negative element with 0 is: ");
			for(int i=0;i<a.length;i++){
				System.out.print(a[i]+" ");
			}
		}
}