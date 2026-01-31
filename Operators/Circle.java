/*Q 5. Write a java program to enter the radius of a circle and find its diameter,area and circumference.
Formula :-
diameter=2 * radius;
circumference = 2 * 3.14 * radius; area = 3.14 * radius * radius;*/

import java.util.*;

public class Circle {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
	double r,diameter,area,circumference,pi=3.14;
	System.out.println("Enter the value of radius of circle: ");
	r= sc.nextDouble();
	diameter= 2 * r;
	circumference = 2 * pi * r;
	area = pi * r * r;
	System.out.println("Diameter = "+diameter);
	System.out.println("Circumference = "+circumference);
	System.out.println("Area = "+area);
    }
}
