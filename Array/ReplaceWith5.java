/*Q3. Replace all elements in the array that are multiples of 5 with the number 5 itself.
Input: [10, 12, 15, 17, 20]
Output: [5, 12, 5, 17, 5]

Explanation:
10 is divisible by 5 → replaced with 5.
12 is not divisible by 5 → unchanged.
15 is divisible by 5 → replaced with 5.
17 is not divisible by 5 → unchanged.
20 is divisible by 5 → replaced with 5.
*/


import java.util.*;
public class ReplaceWith5{
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
				if(a[i]%5==0){
					a[i]=5;
				}
			}
			System.out.print("\nReplace all elements in the array that are multiples of 5 with the number 5 itself: ");
			for(int i=0;i<a.length;i++){
				System.out.print(a[i]+" ");
			}
		}
}