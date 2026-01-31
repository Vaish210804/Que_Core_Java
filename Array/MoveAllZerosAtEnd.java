/*Q6. Move all zeros in an array to the end while maintaining the relative order of non-zero elements.
	Input :- arr = [0, 1, 0, 3, 12]
	Output :- arr = [1, 3, 12, 0, 0]
Explanation:
All non-zero elements [1, 3, 12] retain their original order.
All zeros are moved to the end of the array.
*/

import java.util.*;
public class MoveAllZerosAtEnd{
		public static void main(String x[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		int b[]=new int[size];
		System.out.print("Enter the Elements of array: ");
		for(int i=0; i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.print("Input Array: ");
		for(int i=0; i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		int k=0;// b initially starts from 0 that's why took k=0 consider k as index here 
		for(int i=0;i<a.length;i++){
				if(a[i]!=0){
					b[k++]=a[i];
				}
		}
		System.out.print("\nAfter shifting all zeros to the end of the array: ");
		for(int i=0; i<b.length;i++){
			System.out.print(b[i]+" ");
		}	
	}
}			