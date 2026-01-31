/*

Q4. Write a program in java to find the smallest missing element from a sorted array?
		
Expected Output :
		The given array is : 0 1 3 4 5 6 7 9
		The missing smallest element is: 2
*/


import java.util.*;
public class SmallestMissingElFromSortedArray
{  public static void main(String x[])
   { Scanner xyz  = new Scanner(System.in);
     	int a[]=new int[5];
     	int s=0;
	int b[]=new int[a.length * 10];
	 System.out.print("Enter ascending order values in array: ");
	 for(int i=0; i<a.length; i++)
	 {
	    a[i]=xyz.nextInt();
	 }
	 //write missing logics 
	 for(int i=1; i<a.length; i++)
	 {   int next=a[i];
	     int prev=a[i-1];
		    
		 while(prev<(next-1))
		 {  ++prev;
		    b[s++] = prev;
		 }
	 }
	System.out.print("New Array which contains all missing value: ");
	for (int i = 0; i < s; i++) {
    		System.out.print(b[i] + "\t");
	}
	System.out.print("\nThe missing smallest element is: "+b[0]);
   }
}