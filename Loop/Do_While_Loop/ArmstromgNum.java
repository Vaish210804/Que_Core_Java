//Q5. Check whether a number is an Armstrong number using a do-while loop.→ Input: 153 → Output: Armstrong number

import java.util.*;

public class ArmstromgNum {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number: ");
	int num = sc.nextInt();
	int n=0;
	int temp=num;
	int sum=0;
	do{
		temp /=10;
		n++;
	}while(temp!=0);
	temp= num;
	do{
		int rem = temp%10;
		sum += Math.pow(rem, n);
		temp = temp/10;
	}while(temp!=0);
	if(sum==num){
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is NOT an Armstrong number.");
        }
    }
}