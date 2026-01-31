//Write a java program to enter the length and breadth of a rectangle and find its area.
//Formula - area= length * breadth;
 
import java.util.*;

public class AreaOfRectangle {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
	int l,b,area;
	System.out.println("Enter the value of Length: ");
	l =sc.nextInt();
	System.out.println("Enter the value of Breadth: ");
	b =sc.nextInt();
	area = l*b;
	System.out.println("Area of Rectangle: "+area);
    }
}
