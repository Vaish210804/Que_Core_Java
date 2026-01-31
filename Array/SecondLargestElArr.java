/*Q11. Write a java program to give an array, find the second largest element.
Input : Array = {12, 35, 1, 10, 34, 1}
Output : Second largest = 34
Explanation:
First largest is 35, second largest is the next maximum (34). We maintain two variables (largest, secondLargest).
*/


public class SecondLargestElArr {
    public static void main(String[] args) {
        int[] a = {12, 35, 1, 10, 34, 1};
	int l,sl;
	if(a[0]>a[1]){
		l=a[0];
		sl=a[1];
	}
	else{
		l=a[1];
		sl=a[0];
	}
	for(int i=2;i<a.length;i++){
		if(a[i]>l){
			sl=l;
			l=a[i];
		}
		else if(a[i]>sl && a[i]!=l){
			sl=a[i];
		}
	}
	System.out.print("Second Largest Element in the array is: "+sl);
	}
}