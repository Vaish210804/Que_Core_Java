/*Q35. Write a Java program to print this pattern.

	5	4	3	2	1
		4	3	2	1
			3	2	1	
				2	1	
					1
*/

import java.util.*;
public class PA35{
	public static void main(String x[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number of row: ");
		int row = sc.nextInt();
		for(int i=0;i<row;i++){
			for(int z=0; z<i ; z++){
				System.out.print("\t");
			}
			for(int j=row-i;j>=1;j--){
				System.out.print(j+"\t");
			}
			System.out.printf("\n");
		}
	}
}
		