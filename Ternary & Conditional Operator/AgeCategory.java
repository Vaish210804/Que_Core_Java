/*Q35. Check if a person is a child, teenager, adult, or senior based on age.
 
    Input: Age
    Logic: if-else if
    Output: Age category.
*/

import java.util.*;

public class AgeCategory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age < 13) {
            System.out.println("Child");
        }
        else if (age >= 13 && age <= 19) {
            System.out.println("Teenager");
        }
        else if (age >= 20 && age <= 59) {
            System.out.println("Adult");
        }
        else {
            System.out.println("Senior");
        }

        sc.close();
    }
}
