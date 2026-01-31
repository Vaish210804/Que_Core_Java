//Q37. Write a Java program to input cost price and selling price of a product and check profit or loss.

import java.util.*;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cost Price: ");
        int cp = sc.nextInt();
	System.out.print("Selling Price: ");
        int sp = sc.nextInt();


        if(sp>cp) {
           	 System.out.println("Profit");
        }
        else if(sp<cp) {
            	System.out.println("Loss");
        }
	else {
		System.out.println("Neither profit nor loss");
	}
    }
}

