/* half pyramid using number

1
12
123
1234
12345

*/

import java.util.*;

public class HalfPyramidOfNum{
	public static void main(String x[]){
		//int row=6;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int row = sc.nextInt();
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				System.out.printf("%d",j);
			}
		System.out.printf("\n");
		}
	}
}