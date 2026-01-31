//Q6. Write a java program to enter length in centimeter and convert into meter and kilometer.
// 1 cm = 0.01 m and 1 m = 0.001 km

import java.util.*;

    public class CmConversionToMAndKm{
	public static void main(String []args){
		System.out.println("Enter the value of Centimeter: ");
		Scanner sc = new Scanner(System.in);
		double cm = sc.nextDouble();
		double m = cm*0.01;
		double km = cm*0.00001;
		System.out.println("Meter: "+m);
		System.out.println("Kilometer: "+km);
	}
}

