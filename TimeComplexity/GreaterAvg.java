/*Q7. Write a Java program to find elements that are greater than the average of the array.
Explanation
First loop → calculate sum.
Second loop → compare each element with average.
Time Complexity
O(n) (2n → n)
Example :- Array: {2, 4, 6, 8}
 	       Average = 5
	       Elements greater than average: 6 , 8
*/

import java.util.*;
public class GreaterAvg{
		public static void main(String x[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.print("Enter the Elements of array: ");
		for(int i=0; i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.print("Input Array: ");
		for(int i=0; i<a.length;i++){
			System.out.print(a[i]+" ");

		}
		int sum=0;
		for(int i=0; i<a.length;i++){
			sum +=a[i];
		}
		int avg = sum/a.length;
		System.out.print("\nAverage = "+avg);
		System.out.print("\nElements greater than average: ");
		for(int i=0; i<a.length;i++){
			if(a[i]>avg){
				System.out.print(a[i]+" ");
			}
		}
	}
}