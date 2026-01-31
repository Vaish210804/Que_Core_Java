/*Q2. Write a program in java to find the majority element of an array ?

	A majority element in an array of size n is an element that appears more than n/2 times (and

	hence there is at most one such element).

	Expected Output:

	The given array is: 4  8  4  6  7  4  4  8

	There are no Majority Elements in the given array
*/
import java.util.*;
public class MajorityOfEllInArr{
		public static void main(String x[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.print("Enter the Elements of array: ");
		for(int i=0; i<a.length;i++){
			a[i]=sc.nextInt();
		}
		 boolean foundMajority = false;
		for (int i = 0; i < a.length; i++) {
    			int count =0;
			boolean alreadyCounted = false;
			for(int z=0;z<i;z++){
				if(a[i]==a[z]){
					alreadyCounted = true;
					break;
				}
			}
				if(alreadyCounted){
					continue;
				}
				for(int j=0;j<a.length;j++){
					if(a[i]==a[j]){
						count++;
					}
				}
			if(count>a.length/2){
				System.out.println("Majority element is: " + a[i]);
                		foundMajority = true;
                		break;
			}
		}
		if(!foundMajority){
			System.out.println("There are no Majority Elements in the given array");
				
		}

	}
}
