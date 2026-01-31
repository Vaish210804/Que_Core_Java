//WAP to input number from keyboard and print its table? 

 
import java.util.*;

public class TableApp {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number: ");
	int num = sc.nextInt();
	int i = 1;
	while(i<=10){
		System.out.println(num + "x" + i + "=" + (num*i));
		i++;
	}
    }
}