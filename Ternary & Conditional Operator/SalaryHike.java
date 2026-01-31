/*Q41. Employee salary hike based on performance and years of service:
Input: Basic salary, Years of service, Performance rating (1–5)
Logic:
If rating >= 4 and service > 5 yrs → 20% hike
Else if rating >= 3 → 10%
Else → 5%
Output: New salary.
*/

import java.util.*;

public class SalaryHike {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        System.out.print("Enter performance rating (1-5): ");
        int rating = sc.nextInt();

        double hike;

        if (rating >= 4 && years > 5) {
            hike = salary * 0.20;
        } 
        else if (rating >= 3) {
            hike = salary * 0.10;
        } 
        else {
            hike = salary * 0.05;
        }

        double newSalary = salary + hike;
        System.out.println("New Salary: " + newSalary);

    }
}
