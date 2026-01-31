/* hollow inverted half pyramid 

 1 2 3 4 5 
 2     5
 3   5
 4 5
 5

*/


import java.util.*;

public class HollowHalfPyramidReverseOfNum{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int row = sc.nextInt();
		for(int i=1;i<=row;i++)
		  {
			  for(int j=i;j<=row;j++){
				  if(i==1 ||j==row||i==j )
				     System.out.print(j);
			         else
					 {
						 System.out.print(" ");
					 }  
                     
			}
		System.out.printf("\n");
		}
	}
}

