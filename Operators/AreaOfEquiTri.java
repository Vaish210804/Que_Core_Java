//Q10. Write a java program to calculate the area of an equilateral triangle. area =√3/4*side*side while √3=1.732

import java.util.*;
public class AreaOfEquiTri
{
	public static void main(String x[])
	{
		Scanner et = new Scanner(System.in);
		float side,area,a=1.732f;
		System.out.println("Enter the value of side:\n");
		side = et.nextFloat();
		area = (a/4)*side*side;
		//area = Math.sqrt(3)/4*side*side;
		System.out.printf("Area of Equilateral Triangle is: %f\n",area);
	}
}
		
		