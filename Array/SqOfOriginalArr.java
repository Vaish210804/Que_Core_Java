/*Q6. Create a new array where each element is the square of the original.
Input: arr = [2, 4, 6, 8]
Output: newArr = [4, 16, 36, 64]
Explanation: For each index, calculate arr[i] * arr[i] and store it in the new array.
*/


import java.util.*;
public class SqOfOriginalArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int[] a = new int[size];

        System.out.print("Enter the values in array: ");
        for(int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
	System.out.print("Original Array: ");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
	 for(int i = 0; i < a.length; i++) {
            a[i]=a[i]*a[i];
        }
	System.out.print("Original Array: ");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
}
}