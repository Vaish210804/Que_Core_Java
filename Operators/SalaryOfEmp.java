//Q28. Write a Java program to calculate the net salary of an employee. Input: basic salary, HRA %, DA %, and tax %.

import java.util.*;

public class SalaryOfEmp{
	public static void main(String []args){
		double bs,hra,da,tax,ns;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Basic salary of an Employee: ");
		bs = sc.nextDouble();
		System.out.println("Enter the HRA: ");
		hra = sc.nextDouble();
		System.out.println("Enter the DA: ");
		da = sc.nextDouble();
		System.out.println("Enter the TAX: ");
		tax = sc.nextDouble();
		hra=(hra/100)*bs;
        	da=(da/100)*bs;
		tax=(tax/100)*bs;
		ns=bs+hra+da-tax;
		System.out.println("The net salary of an employee: "+ns);
	}
}
		