/*
Q59. Write a java program to print this pattern.

1        								1
1	2							2	1
1	2	3					3	2	1
1	2	3	4			4	3	2	1
1	2	3	4	5	5	4	3	2	1

*/

import java.util.*;
public class PA59{
	public static void main(String x[]){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int row = sc.nextInt();
		for(int i=1; i<=row ; i++){
			for(int j =1 ;j<=i ;j++){
					if(i==5){
						for (int s = row - i; s >= 1; s--) {
        						System.out.print("    ");
    						}

    						for (int z = 1; z <= i; z++) {
        						System.out.print(i + "   ");
    						}
					}
					else{
						System.out.print(j+"\t");
					}
				
			}
			System.out.println();
		}
	}
}