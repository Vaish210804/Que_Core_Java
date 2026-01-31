//Q42. Write a java program to read the age of a candidate and determine whether he is eligible to cast his/her own vote.

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the candidate's age: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("The candidate is eligible to cast their own vote.");
        } else {
            System.out.println("The candidate is not eligible to cast their own vote yet.");
        }
    }
}