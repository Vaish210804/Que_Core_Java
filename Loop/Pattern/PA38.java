/* Q38. Write a java program to print this pattern.
	
	1	*	*	*	*
	2	2	*	*	*
	3	3	3	*	*
	4	4	4	4	*
	5	5	5	5	5
*/

import java.util.*;
public class PA38{
	public static void main(String x[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number of row: ");
		int row = sc.nextInt();
		for(int i=1;i<=row;i++){
			
			for(int j=1 ; j<=i ; j++){
				System.out.print(i+"\t");
			}
			for(int s=i+1 ; s<=row ; s++){
				System.out.print("*\t");
			}
				System.out.printf("\n");
		}
	}
}