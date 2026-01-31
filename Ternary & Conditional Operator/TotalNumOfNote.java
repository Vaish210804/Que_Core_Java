 /*Q25.Write a java program to find the total number of notes in a given num.  
                    	
            Enter the num: 2528
Expected output : 500=5 , 100=0 , 50=0 , 20=1 , 10=0 , 5=1 , 2=1 , 1=1
*/

import java.util.*;
public class TotalNumOfNote{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int n500, n100, n50, n20, n10, n5, n2, n1;

        	n500 = num / 500;
	        num %= 500;

	        n100 = num / 100;
	        num %= 100;
		
        	n50 = num / 50;
        	num %= 50;

        	n20 = num / 20;
        	num %= 20;

        	n10 = num / 10;
        	num %= 10;

        	n5 = num / 5;
        	num %= 5;

        	n2 = num / 2;
        	num %= 2;

        	n1 = num;

        	System.out.println("500=" + n500 + " , 100=" + n100 + " , 50=" + n50 +
                	" , 20=" + n20 + " , 10=" + n10 + " , 5=" + n5 +
                	" , 2=" + n2 + " , 1=" + n1);

      	
    	}
}