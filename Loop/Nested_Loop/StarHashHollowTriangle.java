/*
Q17. Write a java program to print this pattern.

	*	*	*	*	*
	*			*
	*		*
	*	*
	*
*/

import java.util.*;

public class StarHashHollowTriangle{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int row = sc.nextInt();
		for(int i=row;i>=1;i--){
			for(int j=1;j<=i;j++){
				if(i==row || j==1 || i==j){
					System.out.print("*\t");
				}
				else{
					System.out.print("\t");
				}
			}
		System.out.printf("\n");
		}
	}
}