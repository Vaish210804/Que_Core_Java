/*Q58. Write a java program to print this pattern.

1       								9
	2     						8
  		3				7
   			4		6
				5
   			4 		6
  		3   				7
         2     						8
1       								9
*/

import java.util.*;
public class PA58{
	public static void main(String x[]){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int row = sc.nextInt();
		for(int i=1; i<=row * 2 - 1 ; i++){
			for(int j =1 ;j<=row * 2 - 1;j++){
				if(j==i || i+j==(row * 2 - 1)+1){
					System.out.print(i+"\t");
	
				}
				else{
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}