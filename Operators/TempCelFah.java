/*Q8. Write a java program to enter temperature in Celsius and convert it into Fahrenheit.
Formula :- fah = (cel * 9 / 5) + 32;*/

import java.util.*;

    public class TempCelFah{
	public static void main(String []args){
		System.out.println("Enter the value of Temperature in Celcius: ");
		Scanner sc = new Scanner(System.in);
		double cel = sc.nextDouble();
		double fah = (cel * 9 / 5) + 32;
		System.out.println("Temperature in Fahrenheit: "+fah);
	}
}