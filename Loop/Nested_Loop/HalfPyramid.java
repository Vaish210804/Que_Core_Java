// Half Pyramid



import java.util.*;

public class HalfPyramid{
	public static void main(String x[]){
		//int row=6;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int row = sc.nextInt();
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				System.out.printf("*");
			}
		System.out.printf("\n");
		}
	}
}