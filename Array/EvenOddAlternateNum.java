/*Q9.Rearrange the array so that even and odd numbers alternate. Assume the number of even and odd elements is equal.
	Input :- arr = [1, 2, 3, 4, 5, 6]
	Output :-  [2, 1, 4, 3, 6, 5]
Explanation:
Even and odd elements are rearranged to appear alternately: Even → Odd → Even → Odd.
The relative order within even and odd groups may not be important, but alternation is maintained.
*/

import java.util.*;
public class EvenOddAlternateNum{
		public static void main(String x[]){
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the size of array: ");
			int size = sc.nextInt();
			int a[] = new int[size];
			int eve[]=new int[size/2];
			int odd[]=new int[size/2];
			int result[]= new int[size];
			System.out.print("Enter the elements in array: ");
			for(int i=0;i<a.length;i++){
				a[i]=sc.nextInt();
			}
			System.out.print("Input Array is: ");
			for(int i=0;i<a.length;i++){
				System.out.print(a[i]+" ");
			}
			int e=0,o=0;// e==even and o==odd;
			for(int i=0;i<a.length;i++){
				if(a[i]%2==0){
					eve[e++]=a[i];
				}	
				else{
					odd[o++]=a[i];
				}
			}
			System.out.print("\nodd elements in the array: ");
			for(int i=0;i<a.length/2;i++){
				System.out.print(odd[i]+" ");
			
			}
			System.out.print("\nEven elements in the array: ");
			for(int i=0;i<a.length/2;i++){
				System.out.print(eve[i]+" ");
			
			}
			
			int ei=0,oi=0; // ei==even index and oi==odd index;
			for(int i=0;i<a.length;i++){
				if(i%2==0){
					result[i]=eve[ei++];
				}	
				else{
					result[i]=odd[oi++];

				}
			}
			System.out.print("\nAfter Even and odd elements are rearranged to appear alternately: ");

			for(int i=0;i<result.length;i++){
				System.out.print(result[i]+" ");
			}

		}
}