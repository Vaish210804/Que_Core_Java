// Q17. Write a Java program to convert seconds to hours, minutes and seconds. 

import java.util.*;
public class TimeApp
{
	public static void main(String x[])
	{
		Scanner scanner = new Scanner(System.in);
		int sec,min,hr;
		System.out.println("Enter the value of Time in second:");
		sec=scanner.nextInt();
		hr=sec/3600;
		min = (sec%3600)/60;
		sec = sec%60;
		System.out.println("The final Time is: "+hr+":"+min+":"+sec);
	}
}