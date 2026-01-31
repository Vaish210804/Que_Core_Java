/*Q6. Write a Java program to count frequency of each element in an array.
Explanation
Use nested loops.
Count matching elements.
Time Complexity
O(n²)
Example :- Array: {1, 2, 1}
	       Output :- 1 -> 2
           2 -> 1
*/

import java.util.*;
public class FrequencyELArr{
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
		System.out.println("\nFrequency of each element in an array: ");
		for(int i=0; i<a.length;i++){
			int count=0;
			boolean isAlreadycount =false;
			for(int k=0;k<i;k++){
				if(a[i]==a[k]){
					isAlreadycount = true;
					break;
				}
			}
			
				if(isAlreadycount){
					continue;
				}	
			for(int j=0;j<a.length;j++){
				if(a[i]==a[j]){
					count++;
				}
			}
			System.out.println(a[i] + " -> " + count);
		}
	}
}



