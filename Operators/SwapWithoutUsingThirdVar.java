//Q15. Write a java program swap two numbers without using a third variable. 

import java.util.*;
public class SwapWithoutUsingThirdVar
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int a,b;
		System.out.println("Enter the two values:\n");
		a=xyz.nextInt();
		b=xyz.nextInt();
		System.out.println("Before Swapping:\n");
		System.out.printf("A=%d\tB=%d\n",a,b);
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("After Swapping:\n");
		System.out.printf("A=%d\tB=%d\n",a,b);
	}
}
		