//WAP input number and check number is Armstrong or not? 

import java.util.*;

public class ArmstromgNum {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number: ");
	int num = sc.nextInt();
	int n=0;
	int temp=num;
	int sum=0;
	while(temp!=0){
		temp /=10;
		n++;
	}
	temp= num;
	while(temp!=0){
		int rem = temp%10;
		sum += Math.pow(rem, n);
		temp = temp/10;
	}
	if(sum==num){
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is NOT an Armstrong number.");
        }
    }
}
	