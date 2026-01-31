/*Q9. Count the number of Perfect numbers in an array.
Input: arr = [6, 28, 10, 12, 496]
Output: Count of Perfect numbers = 3
Explanation: A Perfect number is equal to the sum of its proper divisors (excluding itself). For each element, find sum of divisors and compare with the number, then count.
*/



import java.util.*;
public class CountOfPerfectNum {
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
	int perfectnum=0;
	for(int i=0;i<a.length;i++){
		int sum =0;
		for(int j=1;j<a[i];j++){
			if (a[i] % j == 0) {
				sum=sum+j;
            		}
		}
		if(sum==a[i]){
			perfectnum++;
		}
	}
	System.out.print("\nCount of perfect numbers = "+ perfectnum);
}
}



