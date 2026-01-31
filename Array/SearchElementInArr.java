import java.util.*;
public class SearchElementInArr{
		public static void main(String x[]){
			Scanner sc= new Scanner(System.in);
			int a[] = new int[5];
			System.out.print("Enter the values in array: ");
			for(int i=0; i<a.length;i++){
				a[i]=sc.nextInt();
			}
			System.out.print("Enter the Search Key value: ");
			int searchKey = sc.nextInt();
			Boolean flag = false;
			for(int i=0; i<a.length;i++){
				if(a[i]==searchKey){
					flag=true;
					break;
				}
			}
			if(flag){
				System.out.print("Found");
			}
			else{
				System.out.print("Not Found");					
			}
	}
}
				
	
			