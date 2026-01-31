// Half Pyramid Reverse


import java.util.*;

public class HalfPyramidReverse{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int row = sc.nextInt();
		for(int i=row;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.printf("*");
			}
		System.out.printf("\n");
		}
	}
}