/*Q9. Write a Java program to find the majority element in an array (appears more than n/2 times).
Explanation
Count occurrences of each element using nested loops.
Check if count > n/2.
Time Complexity
O(n²)
Example :- Array: {2, 2, 1, 2}
	   Majority element = 2
*/

import java.util.*;
public class MajorityOfEllInArr{
		public static void main(String x[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.print("Enter the Elements of array: ");
		for(int i=0; i<a.length;i++){
			a[i]=sc.nextInt();
		}
		boolean foundmajority=false;	
		for(int i =0; i<a.length;i++){
			int count =0;
			boolean alreadycount = false;
			for(int k=0;k<i;k++){
				if(a[i]==a[k]){
					alreadycount = true;
					break;
				}
			}
	
			if(alreadycount){
				continue;
			}
			for(int j=0; j<a.length;j++){
				if(a[i]==a[j]){
					count++;
				}
			}
			if(count>a.length/2){
				System.out.println("Majority element = "+a[i]);
				foundmajority=true;
				break;
			}
		}
		if(!foundmajority){
			System.out.println("There are no Majority Elements in the given array");
		}
	}
}


