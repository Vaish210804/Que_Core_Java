/*Q42. Write a java program to print this pattern.

	1	2	3	4	5
	6	7	8	1	2
	3	4	5	6	7
	8	1	2	3	4	
	5	6	7	8	1
*/


import java.util.*;
public class PA42{
	public static void main(String x[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number of row: ");
		int row = sc.nextInt();
		int num =1;
		for (int i = 1; i <= row; i++) {
    				for (int j = 1; j <= row; j++) {
        				System.out.print(num + "\t");
        				num++;
        				if (num == 9) {
            				num = 1;
        				}
    				}
    				System.out.println();
			}
	}
}