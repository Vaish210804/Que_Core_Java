/*Q43. Calculate fine for library book return:
Input: Number of days late
Logic:
Up to 5 days → ₹2/day
6–10 days → ₹3/day
11–30 days → ₹5/day
More than 30 days → Membership canceled + ₹500 fine
Output: Total fine + membership status.
*/


import java.util.*;

public class LibraryFine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days late: ");
        int days = sc.nextInt();
        int fine = 0;
        String status = "Active";

        if (days <= 5 && days > 0) {
            fine = days * 2;
        } 
        else if (days <= 10) {
            fine = days * 3;
        } 
        else if (days <= 30) {
            fine = days * 5;
        } 
        else if (days > 30) {
            fine = 500;
            status = "Membership Canceled";
        } 
        else {
            fine = 0; // if days <= 0
        }

        System.out.println("Total Fine: ₹" + fine);
        System.out.println("Membership Status: " + status);

        sc.close();
    }
}
