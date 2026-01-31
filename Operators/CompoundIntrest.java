//Q13. Write a java program to calculate the compound interest.

import java.util.*;
public class CompoundIntrest
{
	public static void main(String x[])
	{
		Scanner cc = new Scanner(System.in);
		int p,n,t;
		double r,CI;
		System.out.println("Enter Principle Amount:\n");
		p= cc.nextInt();
		System.out.println("Enter the no of times intrest applied per time period:\n");
		n= cc.nextInt();
		System.out.println("Enter Time period:\n");
		t= cc.nextInt();
		System.out.println("Enter Rate of Intrest:\n");
		r= cc.nextLong();
		CI= p*Math.pow((1+(r/n)),n*t);//------------p(1+(r/n))^(nt)
		System.out.printf("The value of Compound Intrest is:%fl\n ",CI);
	}
}
		