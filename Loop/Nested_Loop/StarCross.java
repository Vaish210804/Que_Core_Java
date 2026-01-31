/*Q20. Write a java program to print this pattern.

	*						*
	*	*				*	*
	*		*		*		*
	*			*			*
	*		*		*		*
	*	*				*	*
	*						*

*/


public class StarCross {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
			if(j==1 || j == 7 || j == i || i+j==7+1){
				System.out.printf("*\t");
			}
			else{
				System.out.printf("\t");
			}
            }
            System.out.println();
        }
    }
}