/*WAP to input number and count its digit. 
Input: 12345 
Output: Number of digits in number is 5.
*/

import java.util.*;

public class CountOfNum {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number: ");
	int num = sc.nextInt();
	int count=0;
	while(num!=0){
		num /=10;
		count++;
	}
	System.out.println("Count: "+count);
    }
}
	