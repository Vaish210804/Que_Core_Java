/*Q6. Write a java program to search an element in an array , its element found or not.
Input:
 Array = {10, 20, 30, 40, 50}
 Element to search = 30
Output : Element 30 found at index 2
Explanation :
We traverse the array and compare each element with the search key. If it matches, print "found" with index; otherwise print "not found".
 */



import java.util.*;
public class SearchElementInArrAtIndex{
		public static void main(String x[]){
			Scanner sc= new Scanner(System.in);
			int a[] = new int[5];
			int I=-1;
			System.out.print("Enter the values in array: ");
			for(int i=0; i<a.length;i++){
				a[i]=sc.nextInt();
			}
			System.out.print("Enter the Search Key value: ");
			int searchKey = sc.nextInt();
			Boolean flag = false;
			for(int i=0; i<a.length;i++){
				if(a[i]==searchKey){
					flag=true;
					I = i;
					break;
				}
			}
			if(flag){
				System.out.print("Element "+a[I]+" Found at index "+I);
			}
			else{
				System.out.print("Not Found");					
			}
	}
}