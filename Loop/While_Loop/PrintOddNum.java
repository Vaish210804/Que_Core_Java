//. Write a java program to print all odd numbers between 1 to 100.

public class PrintOddNum{
	public static void main(String x[]){
		int i=1;
		while(i<=100){
			if(i%2!=0){
				System.out.println(i);
			}
			i++;
		}
	}
}