/*Q1. Write a java program to count the frequency of each element in a given array.
Input:
Array = {1, 2, 2, 3, 3, 3, 4}
Output:
 1 → 1 time
 2 → 2 times
 3 → 3 times
 4 → 1 time
Explanation:
For each element, count how many times it occurs in the array using nested traversal.*/

public class FrequencyNumInArr{
		public static void main(String x[]){
		
		int a[]={1, 2, 2, 3, 3, 3, 4};
		
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
			System.out.println(a[i] + " = " + count + " times");
		}
	}
}

