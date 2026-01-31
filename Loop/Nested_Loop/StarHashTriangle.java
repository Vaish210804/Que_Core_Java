/* 
Q12. Write a java program to print this pattern.

	#	# 	#	#	#
	*	*	*	*
	#	#	#
	*	*
	#

*/

import java.util.*;

public class StarHashTriangle{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int row = sc.nextInt();
		for(int i=row;i>=1;i--){
			for(int j=1;j<=i;j++){
				if(i%2==0){
					System.out.printf("* ");
				}
				else{
					System.out.printf("# ");
				}
			}
		System.out.printf("\n");
		}
	}
}