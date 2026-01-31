/*Q3.Write a Java program to reverse the elements of an array.
Explanation :- Swap first with last, second with second last, etc.
Time Complexity
O(n)
Example :- Array: {10, 20, 30}
	       Output : 30 20 10
*/

import java.util.*;
public class ReverseArr{
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
		for(int i=0;i<a.length/2;i++){
			int temp=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=temp;
		}
		System.out.print("Output Array: ");
		for(int i=0; i<a.length;i++){
			System.out.print(a[i]+" ");

		}
	}
}

			
		