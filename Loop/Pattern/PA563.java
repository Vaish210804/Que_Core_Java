/*Q63. Write a java program to print this pattern.

	A
	B	B
	C	C	C	
	D	D	D	D
	E	E	E	E	E

*/

import java.util.*;
public class PA563{
	public static void main(String x[]){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int row = sc.nextInt();
		for(int i=0; i<row ; i++){
			for(int j =0 ;j<=i ;j++){
				char ch = (char) ('A' + i); 
				System.out.print(ch+"\t");
				

			}
		
			System.out.println();
		}
	}
}