/*Q4. Write a Java program to check whether an array is sorted in ascending order.
Explanation
Compare adjacent elements.
If any arr[i] > arr[i+1], array is not sorted.
Time Complexity
O(n)
Example :- Array: {2, 4, 6, 8}
	       Output : Array is sorted.
*/



import java.util.*;
public class CheckSortedArr{
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
		boolean flag =false;
		for(int i=0; i<a.length-1;i++){
			if(a[i]>a[i+1]){
				flag=true;
				break;
			}
		}
		if(flag){
			System.out.print("\nArray is Not sorted.");
		}
		else{
			System.out.print("\nArray is sorted.");
		}
	}
}

