//Q11. Write a java program to enter marks of five subjects and calculate total marks and percentage.

import java.util.*;
public class ResultAppOfFiveSun
{
	public static void main(String x[])
	{
		Scanner mp = new Scanner(System.in);
		int math,phy,chem,eng,hindi,total,per;
		System.out.println("Enter the marks of each subject respectively:\n");
		math=mp.nextInt();
		phy=mp.nextInt();
		chem=mp.nextInt();
		eng=mp.nextInt();
		hindi=mp.nextInt();
		total=math+phy+chem+eng+hindi;
		System.out.printf("Total marks the of subject is:%d\n",total);
		per=(total*100)/500;
		System.out.printf("Percentage is:%d\n",per);
	}
}

		
		