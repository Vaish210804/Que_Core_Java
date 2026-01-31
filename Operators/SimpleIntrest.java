/*Q12. Write a java program to calculate the simple interest. 
       SI=(P*R*T)/100*/

import java.util.*;
public class SimpleIntrest
{
	public static void main(String x[])
	{
		Scanner Simp = new Scanner(System.in);
		int p,r,t,SI;
		System.out.println("Enter the values of Principle amount,Rate of Intrest an the time requird in years Respectively:\n");
		p=Simp.nextInt();
		r=Simp.nextInt();
		t=Simp.nextInt();
		SI=(p*r*t)/100;
		System.out.printf("Simple Intrest is:%d\n",SI);
	}
}