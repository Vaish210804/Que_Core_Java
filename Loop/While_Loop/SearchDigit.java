//WAP to input number from keyboard and search digit present in number or not

import java.util.*;

public class SearchDigit{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		long num = sc.nextInt();
		System.out.println("Enter the Digit for searching: ");
		int digit = sc.nextInt();
		boolean search = false;
		long temp = num;
		while(temp!=0){
			long rem =temp%10;
			if(rem==digit){
				search = true;
				break;
			}
			temp/=10;
		}
		if(search){
			System.out.println("Digit " + digit + " is PRESENT in number " + num);
        	}
		else {
            		System.out.println("Digit " + digit + " is NOT present in number " + num);
       		}
    	}
}
			
		