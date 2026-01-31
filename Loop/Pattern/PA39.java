/*Q39. Write a java program to print this pattern.

	5	*	5	*	5
	4	*	4	*
	3	*	3
	2	*
	1
*/

import java.util.*;
public class PA39{
	public static void main(String x[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number of row: ");
		int row = sc.nextInt();
		for(int i=row;i>=1;i--){
			for(int j=1; j<=i ; j++){
				if(j%2==0){
					System.out.print("*\t");
				}
				else{
					System.out.print(i+"\t");
				}
			
			}
			
				System.out.printf("\n");
		}
	}
}