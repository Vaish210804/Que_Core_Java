/*Q2. Write a Java program to calculate the sum of all elements in an array.
Input:
 Array Size = 5
 Array Elements = 2 4 6 8 10
Output:
 Sum of array elements = 30
Explanation:
Initialise a variable sum = 0.
Traverse the array and add each element to the sum.
After the loop ends, sum will hold the total of all array elements.*/



import java.util.*;
public class SumOfElementsInArr{
	public static void main(String x[]){
		Scanner sc= new Scanner(System.in);
		int a[]=new int[5];
		int sum=0;
		System.out.print("Enter the elements in array: ");
		for(int i =0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.print("Sum of all elements in the array is: ");

		for(int i =0;i<a.length;i++){
			sum += a[i];		
		}
		System.out.print(sum);
	}
}
