/*
Q8. Write a Java program to count positive, negative, and zero elements in an array.
Explanation
Traverse array and check each value.
Increment respective counters.
Time Complexity
O(n)
Example :- Array: {1, -2, 0, 5, -3}
	       Positive = 2
                   Negative = 2
       Zero = 1
*/
import java.util.*;
public class CountPosNegZero{
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
		int pos=0,neg=0,zero=0;
		for(int i=0; i<a.length;i++){
			if(a[i]>0){
				pos++;
			}
			else if(a[i]<0){
				neg++;
			}
			else{
				zero++;
			}			
		}
		System.out.print("\nPositive = "+pos);
		System.out.print("\nNegative = "+neg);
		System.out.print("\nZero = "+zero);
	}
}