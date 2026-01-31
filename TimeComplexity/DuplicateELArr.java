/*Q5. Write a Java program to find duplicate elements in an array.
Explanation
Use nested loops.
Compare each element with all others.
Time Complexity
O(n²)
Example :- Array: {1, 2, 3, 2}	Duplicate element = 2
*/

import java.util.*;
public class DuplicateELArr{
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
		boolean isDuplicate = false;
		System.out.print("\nDuplicate elements: ");
		for(int i=0; i<a.length;i++){
			boolean alreadycount= false;
			for (int k = 0; k < i; k++) {
                			if (a[i] == a[k]) {
                    			alreadycount = true;
                    			break;
                			}
            		}
			if(alreadycount){
				continue;
			}
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					isDuplicate = true;
					System.out.print(a[i] + " ");
					break;
				}
			}		
		}
		if(!isDuplicate){
			System.out.print("\nNo duplicate elements found.");
		}
	}
}