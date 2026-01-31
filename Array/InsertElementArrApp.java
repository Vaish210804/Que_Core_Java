/*Q12. Write a program in java to insert an element at desired position from an array.
	Test Data :

	Input the size of array : 6

	Input 5 elements in the array in ascending order :
	1   2    3    4    5
	
	Input the position where to insert : 2
	Value :      200

	Expected Output : The new list is : 1 2 200 3 4 5
*/




import java.util.*;
public class InsertElementArrApp{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		int a[]=new int[6];
		System.out.print("Enter the value in array: ");
		for(int i=0; i<a.length-1; i++){
			a[i]=sc.nextInt();
		}
		System.out.print("Enter the value of Index: ");
		int index = sc.nextInt();
		System.out.print("Enter the value of input variable: ");
		int input = sc.nextInt();
		System.out.println("Before Inserting the value the array is: ");
		for(int i=0; i<a.length ; i++){
			System.out.print(a[i]+" ");
		}
		for(int i=a.length-2 ; i>=index ; i--){
			a[i+1]=a[i];
		}
		a[index]=input;
		System.out.println("\nAfter Inserting the value the array is: ");
		for(int i =0 ; i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
