/*Q52. Write a java program to print this pattern.

	1	0	0	0	1
	0	1	0	1	0
	0	0	1	0	0
	0	1	0	1	0
	1	0	0	0	1
*/

import java.util.*;
public class PA52{
	public static void main(String x[]){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int row = sc.nextInt();
		for(int i=1; i<=row ; i++){
			for(int j =1 ;j<=row;j++){
				if((i + j == row + 1) || i==j){
					System.out.print("1"+"\t");
				}
				else{
					System.out.print("0"+"\t");
				}
			}
			System.out.println();
		}
	}
}