/* print a following pattern

*  *  *  *  * 
*           * 
*           * 
*  	    * 
*  *  *  *  * 

*/


public class HollowSquarePattern{
	public static void main(String x[]){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i == 1 || i == 5 || j == 1 || j == 5){
				System.out.printf("*  ");
				}
				else{
				System.out.printf("   ");
				}
			}
			System.out.printf("\n");
		}
	}
}


