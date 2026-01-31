/* Q11. Write a java program to print this pattern.

*
*	*
* 		*
*  			*
*	*	*	*	*

*/

public class HollowPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
			if(i==5 || j==1 || j==i){
					System.out.printf("*  ");
				}
				else{
					System.out.printf("   ");
				}
		

            }
            System.out.println();
        }
    }
}