/*Q34. Check whether a given employee is eligible for bonus:
 
Input: Years of service and salary.
Logic: If service > 5 years, give 5% bonus.
Output: Display bonus amount or no bonus.*/


import java.util.*;

public class BonusCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus Amount: " + bonus);
        } else {
            System.out.println("No Bonus");
        }

        sc.close();
    }
}

