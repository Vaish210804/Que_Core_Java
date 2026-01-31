/* hollow half pyramid 

1
1 2
1   3
1     4
1       5
1 2 3 4 5 6

*/


import java.util.*;

public class HollowHalfPyramidOfNum{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int row = sc.nextInt();
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				if(i==row || j==1 || j==i){
					System.out.printf("%d",j);
				}
				else{
					System.out.printf(" ");
				}

			}
		System.out.printf("\n");
		}
	}
}

