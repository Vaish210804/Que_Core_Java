/* Q7. Write a java program to display the reverse array.

Input : Array = {1, 2, 3, 4, 5}
Output : Reverse array = {5, 4, 3, 2, 1}
Explanation :
The last element becomes the first, and the first becomes the last by traversing from the end to the start.
*/


import java.util.*;
public class ReverseElementArrApp{
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
		for(int i=0 ; i<a.length/2 ; i++){
			 int temp = a[i];
    			a[i] = a[(a.length - 1) - i];
    			a[(a.length - 1) - i] = temp;
		}
		System.out.println("Reverse array is: ");
		for(int i=0; i<a.length ; i++){
			System.out.print(a[i]+" ");
		}
	}
}