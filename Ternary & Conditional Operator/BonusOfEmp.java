/*Q57. Question:
If performance rating > 8, give 15% bonus; else if rating > 5, give 10% bonus; otherwise, no bonus. Use relational operators to implement logic.
*/

import java.util.*;

public class BonusOfEmp{
	public static void main(String []args){
		double bs,pr;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Basic salary of an Employee: ");
		bs = sc.nextDouble();
		System.out.println("Enter the performance rating: ");
		pr = sc.nextDouble();
		double bonus = pr>8 ? (bs*0.15) : pr>5? (bs*0.100): 0;
		System.out.println("The Bonus of an employee is: "+bonus);
	}
}