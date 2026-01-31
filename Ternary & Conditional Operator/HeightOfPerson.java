 //Q16.Write a java program to accept the height of a person in centimeters and categorize the person according to their height.

import java.util.*;
public class HeightOfPerson{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the PerHeight : ");
		double PerHeight  = sc.nextDouble();
		String result = PerHeight < 150.0  ? "The person is Dwarf." : (PerHeight >= 150.0 && PerHeight < 165.0) ? "The person is average heighted.":"The person is taller.";
		System.out.println("Result: "+result);
	}
}


