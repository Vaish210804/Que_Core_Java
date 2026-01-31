/* Q5. Write a Java program to count even & odd values from an array.
Input:
 Array Size = 7
 Array Elements = 12 17 24 39 40 55 70
Output:
 Count of Even Values = 4
 Count of Odd Values = 3
Explanation:
Initialize counters: evenCount = 0, oddCount = 0.


For each element in the array:


If divisible by 2 → increase evenCount.
Otherwise → increase oddCount.


Final counts are displayed.
*/



import java.util.*;
public class CountOfEvenOddElArr{
	public static void main(String x[]){
		Scanner sc= new Scanner(System.in);
		int a[]=new int[7];
		int even =0,odd=0;
		System.out.print("Enter the elements in array: ");
		for(int i =0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		for(int i =0;i<a.length;i++){
			if(a[i]%2==0){
				even++;	
			}
		}
		for(int i =0;i<a.length;i++){
			if(a[i]%2!=0){
					odd++;
			}
		
		}
		System.out.print("\n Count of Odd Values: "+even);
		System.out.print("\n Count of Odd Values: "+odd);
	}
}