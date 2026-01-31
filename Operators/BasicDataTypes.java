import java.util.*;

public class BasicDataTypes {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

	//byte
        System.out.println("Enter a byte value: ");
	byte b = sc.nextByte();
	System.out.println("The value of byte is: "+b);

	//integer
        System.out.println("Enter a Integer value: ");
	int i = sc.nextInt();
	System.out.println("The value of integer is: "+i);

	//Short
        System.out.println("Enter a Short value: ");
	short s= sc.nextShort();
	System.out.println("The value of Short is: "+s);

	//Long
        System.out.println("Enter a Long value: ");
	long ln = sc.nextLong();
	System.out.println("The value of Long is: "+ln);

	//Float
        System.out.println("Enter a Float value: ");
	float f = sc.nextFloat();
	System.out.println("The value of Float is: "+f);

	//Double
        System.out.println("Enter a Double value: ");
	double d= sc.nextDouble();
	System.out.println("The value of Short is: "+d);

	//Boolean
        System.out.println("Enter a Boolean value: ");
	boolean bl = sc.nextBoolean();
	System.out.println("The value of Boolean is: "+bl);
	
	//Character
        System.out.println("Enter a Char value: ");
	char ch = sc.next().charAt(0);
	System.out.println("The value of Char is: "+ch);

    }
}