/*
Q7.Write a java program count all pairs of elements in an array whose sum is equal to a given number.
	Input :- arr = [1, 5, 7, -1, 5]        sum = 6
Output :- 3
Explanation:
Pairs whose sum = 6 are:
(1, 5) → first occurrence
(7, -1)
(1, 5) → second occurrence (from the second 5)
Total pairs = 3

*/
import java.util.*;
public class CheckSumNumEqual{
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
		System.out.print("\nEnter the number which you want to check: ");
		int num=sc.nextInt();
		int count=0;
		for(int i=0; i<a.length;i++){
			for(int j=i+1; j<a.length ; j++){
				if(a[i]+a[j]==num){
					count++;
				}
			}			
		}System.out.print("\nTotal pairs =: "+ count);

	}
}