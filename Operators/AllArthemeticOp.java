//Q 3. Write a java program to enter two numbers and perform all arithmetic operations. 

import java.util.*;

public class AllArthemeticOp {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
	int num1,num2,sum,sub,div,mod,multi;
	System.out.println("Enter the value of num1: ");
	num1 =sc.nextInt();
	System.out.println("Enter the value of num2: ");
	num2 =sc.nextInt();
	sum= num1+num2;
	sub=num1-num2;
	div=num1/num2;
	mod=num1%num2;
	multi=num1*num2;
	System.out.println("sum = "+sum);
	System.out.println("sub = "+sub);
	System.out.println("div = "+div);
	System.out.println("mod = "+mod);
	System.out.println("multi = "+multi);
   }
}
	
	