import java.util.*;
public class PalindromeLoop
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int n,rev=0,rem;
		System.out.print("Enter the number: ");
		n = sc.nextInt();
		int temp =n;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		System.out.println("Reverse of Number is:"+rev);

		if (temp == rev) {
            		System.out.println("The number is a palindrome.");
        	}
		 else {
           		 System.out.println("The number is not a palindrome.");
        	}
	}
}