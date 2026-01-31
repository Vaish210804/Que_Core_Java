/*Q9. Write a java program to copy one array to another array.
Input : a1 = {5, 10, 15, 20}
Output : a2 = {5, 10, 15, 20}
Explanation:
Copy each element of a1 into a2 using index-by-index assignment */


public class CopyArray {
    public static void main(String[] args) {
        int[] a1 = {5, 10, 15, 20};
        int[] a2 = new int[a1.length];

        for (int i = 0; i < a1.length; i++) {
            a2[i] = a1[i];
        }

        // Print a2
	System.out.print("a2 = ");

        for (int i = 0; i < a2.length; i++) {
            System.out.print(a2[i] + " ");
        }
    }
}
