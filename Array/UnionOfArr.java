/*Q8. Write a java program to find union array of two unsorted array.
	Input :-  arr1 = [1, 2, 3]  
   arr2 = [2, 3, 4, 5]
	Output :- [1, 2, 3, 4, 5]

Explanation:
Union combines all elements from both arrays.
Duplicates are removed to keep only unique elements.
*/
import java.util.*;
public class UnionOfArr{
		public static void main(String x[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the size of First array: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.print("Enter the size of Second array: ");
		int size1 = sc.nextInt();
		int b[]=new int[size1];
		int c[]=new int[a.length+b.length];
		System.out.print("Enter the Elements of First array: ");
		for(int i=0; i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.print("First Array: ");
		for(int i=0; i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.print("\nEnter the Elements of Second array: ");
		for(int i=0; i<b.length;i++){
			b[i]=sc.nextInt();
		}
		System.out.print("Second Array: ");
		for(int i=0; i<b.length;i++){
			System.out.print(b[i]+" ");
		}
		int k=0;
		for(int i=0;i<a.length;i++){
			c[k++]=a[i];
		}
		for(int i=0;i<b.length;i++){
			c[k++]=b[i];
		}
		System.out.print("\nUnion of Array is: ");
		for(int i=0; i<c.length;i++){
			boolean isDuplicate=false;
			for(int j=0; j<i ; j++){
					if(c[i]==c[j]){
						isDuplicate=true;
						break;
					}
			}
			if (!isDuplicate) {
        				System.out.print(c[i] + " ");
    			}

		}
		
		
	}
}




