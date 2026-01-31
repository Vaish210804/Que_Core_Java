//7. Write a java program to find all factors of a number.


import java.util.*;

public class FactNum{
	public static void main(String x[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = s.nextInt();
		System.out.println("Factors of " + num + " are:");
		for(int i=1 ; i<=num;i++){
			if (num % i == 0) {
                		System.out.print(i + " ");
            		}
		}
	}
}