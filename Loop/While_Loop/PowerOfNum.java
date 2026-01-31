//WAP input base and index value from keyboard and calculate power of number.

import java.util.*;

public class PowerOfNum {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
	System.out.println("Base: ");
	int base = sc.nextInt();
	System.out.println("Index: ");
	int index = sc.nextInt();
	int i = 1, result=1;
	while(i<=index){
		result = result*base;
		i++;
	}
	System.out.println("Power of number is: "+result);
   }
}
	