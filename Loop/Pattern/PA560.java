
/*Q60. Write a java program to print this pattern.

	A	A	A	A	A
	B	B	B	B	B
	C	C	C	C	C
	D	D	D	D	D
	E	E	E	E	E

*/

import java.util.*;
public class PA560{
	public static void main(String x[]){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int row = sc.nextInt();
		for(int i=0; i<=row ; i++){
			char ch = (char) ('A' + i); 
			for(int j =1 ;j<=row ;j++){
				System.out.print(ch+"\t");

			}
			System.out.println();
		}
	}
}