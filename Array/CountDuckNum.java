//Q10. Count the number of duck numbers in an array.


import java.util.*;
public class CountDuckNum {
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

	int count =0;
	for(int i=0;i<a.length;i++){
		int num = a[i];
		boolean Duck=false;
		while(num !=0){
			int rem = num%10;
			if(rem==0){
				Duck=true;
				break;
			}
			num = num/10;
		}
		if(Duck){
			count++;
		}
	}
	System.out.print("\nCount of Duck numbers = "+ count);

	}
}
	