//Q9. Write a java program to enter two angles of a triangle and find the third angle. 
import java.util.*;
public  class ThirdAngleOfTriangle
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int f,s,t;
		System.out.println("Enter the value of 1st angle: ");
		f=sc.nextInt();
		System.out.println("Enter the value of 2nd angle: ");
		s=sc.nextInt();
		t=180-(f+s);
		System.out.printf("Value of Third Angle of Triangle is %d\n",t);
		//System.out.println("Value of Third Angle of Triangle is:"+t);
	}
}