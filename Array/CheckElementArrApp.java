import java.util.*;
public class CheckElementArrApp
{ 
   public static void main(String x[])
   {    int a[]=new int[5];
        a[1]=1000;// this initialisation means the array contains a value and it is not empty and if it's not initialised, then it's empty because it's contain zero values by default 
		
        for(int i=0; i<a.length; i++)
		{
		  System.out.print(a[i]+ " ");
		}
		boolean flag=false;
		for(int i=0; i<a.length;i++)
		{
			 if(a[i]!=0)
			 { 	
				flag=true;
		        	break;
			 }
		}
		if(flag)
		{ System.out.println("\nArray not is empty");
		}
		else{
			 System.out.println("\nArray is  empty");
		}
   }
}

