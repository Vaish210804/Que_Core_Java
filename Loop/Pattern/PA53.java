/*Q53.  Write a java program to print this pattern.

	1	2	3	4	5
	6			7
	8		9
	10	11
	12
*/

import java.util.*;
public class PA53{
	public static void main(String x[]){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int row = sc.nextInt();
		int num=1;
		for(int i=1; i<=row ; i++){
			for(int j =1 ;j<=row;j++){
				if(i==1 || j==1 || i+j==row+1){
					System.out.print(num+"\t");
					num++;
				}
				else{
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}