


/*Q56. Write a Java expression using arithmetic and assignment operators to calculate net salary if:
basicSalary = 35000
taxRate = 12%
 Find netSalary.*/

import java.util.*;

public class NetSalaryOfEmp{
	public static void main(String []args){
		double bs,tax,ns;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Basic salary of an Employee: ");
		bs = sc.nextDouble();
		System.out.println("Enter the TAX: ");
		tax = sc.nextDouble();
		tax=(tax/100)*bs;
		ns=bs-tax;
		System.out.println("The net salary of an employee: "+ns);
	}
}