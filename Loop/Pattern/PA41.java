/*Q41. Write a java program to print this pattern.

	1
	3	3	3
	5	5	5	5	5	
	3	3	3
	1
*/



import java.util.*;
public class PA41{
	public static void main(String x[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number of row: ");
		int row = sc.nextInt();
		for (int i = 1; i <= row; i += 2) {
    				for (int j = 1; j <= i; j++) {
        				System.out.print(i + "\t");
    				}
    				System.out.println();
			}

		for (int i = row - 2; i >= 1; i -= 2) {
    				for (int j = 1; j <= i; j++) {
       	 			System.out.print(i + "\t");
    				}
    				System.out.println();
			}

		}
}