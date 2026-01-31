/*Q44. Write a java program to input the basic salary of an employee and calculate its Gross salary according to the following.
Basic Salary <= 10000 : HRA = 20%, DA = 80% Basic Salary <= 20000 : HRA = 25%, DA = 90% Basic Salary > 20000 : HRA = 30%, DA = 95%
*/

import java.util.*;

public class GrossSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bs, hra, da, gross;
	System.out.println("Enter the Basic salary of an Employee: ");
        bs = sc.nextDouble();
	hra= (bs<=1000)?(bs*0.20):(bs <= 20000)?(bs * 0.25):(bs * 0.30);
	da = (bs<=1000)?(bs * 0.80):(bs <= 20000)?(bs * 0.90):(bs * 0.95);
        */if (bs <= 10000) {
            hra = bs * 0.20;
            da = bs * 0.80;
        } else if (bs <= 20000) {
            hra = bs * 0.25;
            da = bs * 0.90;
        } else {
            hra = bs * 0.30;
            da = bs * 0.95;
        }*/

        gross = bs + hra + da;
        System.out.println("Gross Salary = " + gross);
    }
}
