/*Q43. Write a java program to print this pattern.

	1	2	3	4	5
	2	2	3	4	5
	3	3	3	4	5
	4	4	4	4	5
	5	5	5	5	5
*/


import java.util.*;
public class PA43{
	public static void main(String x[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number of row: ");
		int row = sc.nextInt();
		for (int i = 1; i <= row; i++) {
    				for (int j = 1; j <= row; j++) {
					if( j==1 || j<=i){
        					System.out.print(i + "\t");
					}
					else{
						System.out.print(j + "\t");
					}

    				}
    				System.out.println();
			}
	}
}