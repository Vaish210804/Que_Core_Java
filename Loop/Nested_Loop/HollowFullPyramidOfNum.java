// Hollow Full Pyramid of num
/*
         1
      1     2
    1          3
  1              4
1   2   3    4    5 
*/

import java.util.*;
class HollowFullPyramidOfNum
{
    public static void main(String[] args)
    { 
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of rows: "); 
        int row = sc.nextInt();

        for(int i = 1; i <= row; i++)
        {
            for(int j = i; j < row; j++)
            {
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++)
            {
                if(i == row || j == 1 || j == i)
                {
                    System.out.printf("%d ",j);
                }
                else
                {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}
