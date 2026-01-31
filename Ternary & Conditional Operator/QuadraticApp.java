import java.util.*;
public class QuadraticApp
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a:");
		double a = sc.nextDouble();
		System.out.print("Input b:");
		double b = sc.nextDouble();
		System.out.print("Input c:");
		double c = sc.nextDouble();
		Double d = b*b-4*a*c;//d= Determinent
		if(d>0)
		{
			System.out.println("Root1:"+(-b+Math.sqrt(d))/(2*a));
			System.out.println("Root2:"+(-b-Math.sqrt(d))/(2*a));
		}
		else if(d==0)
		{
			System.out.print("Root:"+(-b/(2*a)));
		}
		else//when it becomes less than zero then it have two roots one is real and second on is imaginary
		{
			double r = -b/(2*a);//r==real
			double im = Math.sqrt(-d)/(2*a);//im=imaginary

			System.out.println("Root1:"+r+ "+" +im+'i');
			System.out.println("Root1:"+r+ "-" +im+'i');
		}
	}
}