//WAP to input number and calculate its factorial?

import java.util.*;

public class FactorialOfNum {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number: ");
	int num = sc.nextInt();
	int i = 1;
	long fact = 1;
	while(i<=num){
		fact *= i;
		i++;
	}
	System.out.println("Factorial of"+num+"is: "+fact);

    }
}