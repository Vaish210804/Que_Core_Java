/* Q42. Mobile plan billing system:
Input: Minutes used in a month
Logic:
Up to 100 mins → Base ₹199
101–300 mins → ₹199 + ₹1/min for extra
301–500 mins → ₹199 + ₹1.5/min for extra
Above 500 mins → ₹199 + ₹2/min for extra
Output: Total monthly bill.
*/

import java.util.*;

public class MobileBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter minutes used in a month: ");
        int mins = sc.nextInt();

        double bill = 199; 

        if (mins <= 100) {
            
        }
        else if (mins <= 300) {
            bill += (mins - 100) * 1.0;
        }
        else if (mins <= 500) {
            bill += (300 - 100) * 1.0 + (mins - 300) * 1.5;
        }
        else { 
            bill += (300 - 100) * 1.0 + (500 - 300) * 1.5 + (mins - 500) * 2.0;
        }

        System.out.println("Total Monthly Bill: ₹" + bill);

        sc.close();
    }
}
