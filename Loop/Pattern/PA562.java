/*Q62. Write a java program to print this pattern.

	A	B	C	D	E
	B	C	D	E	F
	C	D	E	F	G
	D	E	F	G	H
	E	F	G	H	I
*/

import java.util.*;
public class PA562{
	public static void main(String x[]){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int row = sc.nextInt();
		char ch1='A';
		for(int i=0; i<row ; i++){
			for(int j =0 ;j<row ;j++){
				char ch = (char) (ch1 + j); 
				System.out.print(ch+"\t");
				

			}
				ch1++;
			System.out.println();
		}
	}
}