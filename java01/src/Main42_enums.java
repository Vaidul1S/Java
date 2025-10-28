import java.util.HashMap;
import java.util.Scanner;

public class Main42_enums {

    public static void main(String[] args) {

        // Enums - Enumerations special class that represents a fixed set of constants.
        // more efficient with switches when comparing Strings

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day of the week: ");
        String response = scanner.nextLine().toUpperCase();

        try{
            Day day = Day.valueOf(response);
            System.out.println(day);
            System.out.println(day.getDayNumber());

            switch (day){
                case MONDAY,
                     TUESDAY,
                     WEDNESDAY,
                     THURSDAY,
                     FRIDAY -> System.out.println("It's a workday.");
                case SATURDAY,
                     SUNDAY-> System.out.println("It's a weekend.");
            }
        }
        catch (IllegalArgumentException e){
            System.out.println("Invalid day!");
        }




        scanner.close();


    }



}
