/*Q1. Write a Java program to find the maximum & minimum element in an integer array.
Time Complexity Explanation :-
We traverse the array once.
Time Complexity: O(n)
Example :	Array = {3, 7, 2, 9, 4}
 		Maximum = 9 , Minimum = 2
*/

import java.util.*;
public class MinMaxElArr{
		public static void main(String x[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.print("Enter the Elements of array: ");
		for(int i=0; i<a.length;i++){
			a[i]=sc.nextInt();
		}
		int max=a[0],min=a[0];
		for(int i=0; i<a.length;i++){
				if(a[i]>max){
					max=a[i];
				}
				if(a[i]<min){
					min=a[i];
				}
	
		}
		System.out.print("\nMaximum = "+max);
		System.out.print(", Minimum = "+min);
	}
}
