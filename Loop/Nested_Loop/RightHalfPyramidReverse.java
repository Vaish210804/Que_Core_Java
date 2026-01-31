//Right half pyramid  Reverse
/*
print the following pattern 
*****
 ****
  ***
   **
    *

*/
class RightHalfPyramidReverse
{
    public static void main(String[] args)
    {
        for(int i = 1; i <= 5; i++)
        {
            // Print spaces
            for(int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
            
            // Print stars
            for(int j = 5; j >= i; j--)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
