/*
Q3. Write a program in java to rotate an array by N positions ?

	Expected Output:

	The given array is: 0  3  6  9  12  14  18  20  22  25  27

	From 4th position the values of the array are: 12 14 18 20 22 25 27 
	Before 4th position the values of the array are: 0  3  6  9 
	After rotating from 4th position the array is:

	12 14 18 20 22 25 27 0 3  6 9
*/

import java.util.*;
public class RotatedArr{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		int b[] = new int[a.length];
		int k = 0;
		System.out.print("Enter the Elements of array: ");
		for(int i=0; i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.print("Enter the value of Index: ");
		int index = sc.nextInt();
		System.out.println("Before rotating the value of array is: ");
		for(int i=0; i<a.length ; i++){
			System.out.print(a[i]+" ");
		}

		
		// from index to end
		for(int i = index; i < a.length; i++){
    			b[k++] = a[i];
		}
		

		// from 0 to index-1
		for(int i = 0; i < index; i++){
    		b[k++] = a[i];
		}
		
							
		System.out.println("After rotating from " + index + " position the array is:");
		for(int i = 0; i < b.length; i++){
    				System.out.print(b[i] + " ");
		}

	}
}