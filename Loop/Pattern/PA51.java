/*Q51. Write a java program to print this pattern.

	1	2	3	4	#
	1	2	3	#	5
	1	2	#	4	5
	1	#	3	4	5
	#	2	3	4	5
*/

import java.util.*;
public class PA51{
	public static void main(String x[]){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int row = sc.nextInt();
		for(int i=1; i<=row ; i++){
			for(int j =1 ;j<=row;j++){
				if(i + j == row + 1){
					System.out.print("#"+"\t");
				}
				else{
					System.out.print(j+"\t");
				}
			}
			System.out.println();
		}
	}
}

				
	