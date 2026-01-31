/*
Q21. Write a java program to print this pattern.

	*	*	*	*	*
	*			*	*
	*		*		*
	*	*			*
	*	*	*	*	*
*/


public class StarCrossSquare {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
			if(j==1 || j == 5 || i==5 || i==1 ||i+j==5+1){
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