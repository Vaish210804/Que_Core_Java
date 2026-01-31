//Q27. Write a java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer, calculate percentagecentage and grade according to given conditions:



import java.util.*;
public class ResultApp
{
	public static void main(String x[])
	{
		Scanner mp = new Scanner(System.in);
		int math,phy,chem,eng,hindi,total,percentage;
		System.out.println("Enter the marks of each subject respectively:\n");
		math=mp.nextInt();
		phy=mp.nextInt();
		chem=mp.nextInt();
		eng=mp.nextInt();
		hindi=mp.nextInt();
		total=math+phy+chem+eng+hindi;
		System.out.printf("Total marks the of subject is:%d\n",total);
		percentage=(total*100)/500;
		System.out.printf("percentagecentage is:%d\n",percentage);
		String result = percentage >= 90% ? "Grade A": percentage >= 80% ? "Grade B": percentage >= 70% ? "Grade C": percentage >= 60% ? "Grade D" :                     	percentage >= 40% ? "Grade E" : "Grade F";
		System.out.println("Result: "+result);




	}
}