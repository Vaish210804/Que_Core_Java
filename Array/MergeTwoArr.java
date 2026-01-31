import java.util.*;
public class MergeTwoArr {
	public static void main(String x[]){
        	Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
        	System.out.print("Enter values in 1st array: ");
        	for(int i=0;i<a.length;i++){
            		a[i]=sc.nextInt();
        	}

        	int b[] = new int[5];
        	System.out.print("Enter values in 2nd array: ");
        	for(int i=0;i<b.length;i++){
            		b[i]=sc.nextInt();
        	}
		int c[] = new int[a.length + b.length];
		// copy a into c
        	for(int i=0;i<a.length;i++){
            		c[i]=a[i];
        	}
		// copy b into c
        	for(int i=0;i<b.length;i++){
            		c[a.length + i] = b[i];
        	}
		System.out.println("After merging the array: ");
        	for(int i=0;i<c.length;i++){
            		System.out.print(c[i]+" ");
        	}
    	}
}
