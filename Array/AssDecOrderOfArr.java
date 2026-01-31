/*Q5. Write a Java program to sort a given array in ascending & descending order.

	 Input : 	Array = [12, 5, 9, 34, 1]
	Output : 	Ascending Order: [1, 5, 9, 12, 34]
Descending Order: [34, 12, 9, 5, 1]

Explanation:
Sorting means arranging elements in a particular order.
In ascending order, numbers are arranged from smallest to largest.
For example: 1 < 5 < 9 < 12 < 34.
In descending order, numbers are arranged from largest to smallest.
For example: 34 > 12 > 9 > 5 > 1.
The program should first sort the array in ascending order, then print the reverse of that order for descending.
*/


import java.util.*;
public class AssDecOrderOfArr {
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		int a[]=new int[5];
		System.out.print("Enter the value in array: ");
		for(int i=0; i<a.length; i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Original array is: ");
		for(int i=0; i<a.length ; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("\nAscending Order: ");
		Arrays.sort(a, 0, a.length);

		for(int i=0; i<a.length ; i++){
			System.out.print(a[i]+" ");
		}

		for(int i=0 ; i<a.length/2 ; i++){
			 int temp = a[i];
    			a[i] = a[(a.length - 1) - i];
    			a[(a.length - 1) - i] = temp;
		}
		System.out.println("\nDescending Order: ");
		for(int i=0; i<a.length ; i++){
			System.out.print(a[i]+" ");
		}
	}
}