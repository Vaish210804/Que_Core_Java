//Q41. Write a java program to find a maximum between three numbers.

import java.util.*;

public class MaxNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int num1,num2,num3;
	System.out.println("Num1: ");
	num1= sc.nextInt();
	System.out.println("Num2: ");
	num2= sc.nextInt();
	System.out.println("Num3: ");
	num3= sc.nextInt();
	int max;
	if(num1>=num2 && num1>=num3){
		 max=num1;
	}
	else if (num2>=num1 && num2>=num3){
		max=num2;
	}
	else{
		max=num3;
	}
	System.out.println("Maximum = " + max);
   }
}