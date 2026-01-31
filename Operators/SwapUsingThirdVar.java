//Q14. Write a java program swap two numbers using a third variable.

import java.util.*;
public class SwapUsingThirdVar
{
	public static void main(String x[])
	{
		Scanner swap = new Scanner(System.in);
		int a,b,temp;
		System.out.println("Enter the values of a");
		a=swap.nextInt();
		System.out.println("Enter the values of b");
		b=swap.nextInt();
		System.out.printf("Before Swapping\n");
		System.out.printf("A=%d\tB=%d\n",a,b);//System.out.println("Before swapping: a= "+a +",b= " +b);
		temp=a;
		a=b;
		b=temp;
		System.out.printf("After Swapping\n");
		System.out.printf("A=%d\tB=%d\n",a,b);
	}
}