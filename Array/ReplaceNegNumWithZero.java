/*Q10. Write a java program to replace all negative numbers in an array with 0.	
	Input :- arr = [2, -3, 4, -1, 5]
	Output :-  [2, 0, 4, 0, 5]
Explanation:
Each negative element is replaced with 0.
Non-negative elements remain unchanged.
*/

import java.util.*;
public class ReplaceNegNumWithZero{
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
				if( a[i]<0){
					a[i]=0;
				}
			}
			System.out.print("\nArray after replacing all negative element with 0 is: ");
			for(int i=0;i<a.length;i++){
				System.out.print(a[i]+" ");
			}
		}
}