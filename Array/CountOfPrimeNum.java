/*Q8. Count the number of prime numbers in an array.
Input: arr = [2, 5, 6, 9, 11]
Output: Count of prime numbers = 3
Explanation: Check each element if it is prime (only divisible by 1 and itself), and count such elements.
*/

import java.util.*;
//alternate logic
public class CountOfPrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
 
        int[] a = new int[size];

        System.out.print("Enter the values in array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
	System.out.print("\nInput array is: ");
	for(int i=0; i<a.length ; i++){
		System.out.print(a[i]+" ");
	}
	int prime=0;
	for(int i=0;i<a.length;i++){
		int count =0;
		for(int j=1;j<=a[i];j++){
			if (a[i] % j == 0) {
				count++;
            		}
		}
		if(count==2){
			prime++;
		}
	}
	System.out.print("Count of prime numbers = "+ prime);
}
}

		
