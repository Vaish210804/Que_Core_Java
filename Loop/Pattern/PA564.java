/*Q64. Write a java program to print this pattern.

	E	E	E	E	E
	D	D	D	D
	C	C	C
	B	B
	A
*/

import java.util.*;
public class PA564{
	public static void main(String x[]){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int row = sc.nextInt();
		for(int i=row; i>=0 ; i--){
			for(int j =0 ;j<=i ;j++){
				char ch = (char) ('A' + i); 
				System.out.print(ch+"\t");
				

			}
		
			System.out.println();
		}
	}
}