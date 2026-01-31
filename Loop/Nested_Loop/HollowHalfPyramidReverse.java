// Hollow Inverted half pyramid 

import java.util.*;

public class HollowHalfPyramidReverse{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int row = sc.nextInt();
		for(int i=row;i>=1;i--){
			for(int j=1;j<=i;j++){
				if(i==row || j==1 || j==i){
					System.out.printf("*");
				}
				else{
					System.out.printf(" ");
				}

			}
		System.out.printf("\n");
		}
	}
}

/// loop will start from the no of row means if row is 6 then it start from 6,5,4...