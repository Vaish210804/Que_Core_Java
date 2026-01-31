import java.util.*;
public class DuckNum
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int num,rem;
		num= sc.nextInt();
		int temp = num;
		boolean duck = false;
		while(temp!=0)
		{
			rem=temp%10;
			if(rem==0)
			{
				duck = true;
				break;
			}
			temp/=10;
		}
		if(duck)
		{
			System.out.print(num+" is a Duck Number");
		}
		else
		{
			System.out.print(num+" is a not Duck Number");
		}

	}
}


