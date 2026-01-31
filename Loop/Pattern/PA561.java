/*Q61. Write a java program to print this pattern.

A	B	C	D	E
A	B	C	D	E
A	B	C	D	E	
A	B	C	D	E
A	B	C	D	E

*/
import java.util.*;
public class PA561{
	public static void main(String x[]){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int row = sc.nextInt();
		for(int i=0; i<=row ; i++){
			for(int j =0 ;j<=row ;j++){
				char ch = (char) ('A' + j); 
				System.out.print(ch+"\t");

			}
			System.out.println();
		}
	}
}