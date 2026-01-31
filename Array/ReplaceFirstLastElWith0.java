/*Q2. Replace First and Last Element with 0.
Input:[5, 3, 7, 2]
Output: [0, 3, 7, 0]


Explanation:
 The first element (5) and the last element (2) are replaced with 0. Middle elements remain the same.
*/


import java.util.*;
public class ReplaceFirstLastElWith0{
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
				if( i==0 || i==a.length-1){
					a[i]=0;
				}
			}
			System.out.print("\nArray after replacing all negative element with 0 is: ");
			for(int i=0;i<a.length;i++){
				System.out.print(a[i]+" ");
			}
		}
}