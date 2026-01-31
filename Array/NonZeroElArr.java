/*Q13. Write a java program to display only non-zero values from an array.
Input : Array = {1, 0, 5, 0, 7, 0, 9}
Output : Non-zero elements = {1, 5, 7, 9}
Explanation :
Traverse the array and print only elements that are not equal to zero.
*/





import java.util.*;
public class NonZeroElArr{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		int a[]={1, 0, 5, 0, 7, 0, 9};
		System.out.print("Array = ");
		for(int i=0; i<a.length ; i++){
			System.out.print(a[i]+" ");
		}
		System.out.print("\n Non-zero elements = ");
		for (int i = 0; i < a.length; i++) 
		{
    			if(a[i]==0){
				continue;
			}
			else{
				System.out.print(a[i] + " ");
			}
		}
		
	}
}