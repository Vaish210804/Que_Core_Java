/*37. Check whether the month number is valid and display season.
 
    Input: 1 to 12
    Logic: if-else if to map to Winter/Spring/Summer/Autumn.
    Output: Season.
*/


import java.util.*;

public class SeasonCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number: ");
        int month = sc.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month");
        }
        else if (month == 12 || month == 1 || month == 2) {
            System.out.println("Winter");
        }
        else if (month >= 3 && month <= 5) {
            System.out.println("Spring");
        }
        else if (month >= 6 && month <= 8) {
            System.out.println("Summer");
        }
        else {
            System.out.println("Autumn");
        }

        sc.close();
    }
}
