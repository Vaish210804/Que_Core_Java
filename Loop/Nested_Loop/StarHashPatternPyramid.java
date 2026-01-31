/*Q8. Write a java program to print this pattern.

#
#	*
#	*	#
#	*	#	*
#	*	#	*	#

*/




public class StarHashPatternPyramid {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
		if(j%2==0){
			System.out.printf("* ");
		}
		else{
			System.out.printf("# ");
		}

            }
            System.out.println();
        }
    }
}