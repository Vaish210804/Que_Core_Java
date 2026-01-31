//Q7. Write a java program to enter temperature in Fahrenheit and convert to Celsius.
//Formula :- cel = (fah - 32) * 5 / 9;


import java.util.*;

    public class TempFahCel{
	public static void main(String []args){
		System.out.println("Enter the value of Temperature in Fahrenheit: ");
		Scanner sc = new Scanner(System.in);
		double fah = sc.nextDouble();
		double cel = (fah - 32) * 5 / 9;
		System.out.println("Temperature in celcius: "+cel);
	}
}
