/*Q10. Write a program in java to delete an element at desired position from an array.
	Test Data :

	Input the size of array : 5

	Input 5 elements in the array in ascending order :
	1   2    3    4    5
	
	Input the position where to delete : 3

	Expected Output : The new list is : 1 2 3 5
*/



import java.util.*;
public class DelateElArr{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		int a[]=new int[5];
		System.out.print("Enter the value in array: ");
		for(int i=0; i<a.length; i++){
			a[i]=sc.nextInt();
		}
		System.out.print("Original array is: ");
		for(int i=0; i<a.length ; i++){
			System.out.print(a[i]+" ");
		}
		System.out.print("\nInput the position where to delete : ");
		int index= sc.nextInt();
		System.out.print("The new array is:  ");
		for (int i = index; i < a.length - 1; i++) 
		{
    			a[i] = a[i + 1];
		}
		for(int i=0; i<a.length-1 ; i++){
			System.out.print(a[i]+" ");
		}

		
	}
}