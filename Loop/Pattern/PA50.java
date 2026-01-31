/*Q50. Write a java program to print this pattern.

				1
			2	2
		3	3	3
	4	4	4	4
		3	3	3	
			2	2
				1
*/

import java.util.*;
public class PA50{
	public static void main(String x[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number of row: ");
		int row = sc.nextInt();
		for (int i = 1; i <= row; i++) {

    		for (int s = row - i; s >= 1; s--) {
        		System.out.print("    ");
    		}

    		for (int j = 1; j <= i; j++) {
        		System.out.print(i + "   ");
    		}

    			System.out.println();
		}
	
		for (int i = row - 1; i >= 1; i--) {

    		for (int s = row - i; s >= 1; s--) {
        		System.out.print("    ");
    		}

    		for (int j = 1; j <= i; j++) {
        		System.out.print(i + "   ");
    		}

    			System.out.println();
		}

        
	}
}