import java.util.InputMismatchException;
import java.util.Scanner;

public class Main35_exception {

    public static void main(String[] args) {

        // Exception

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Enter a number: ");
            int numb = scanner.nextInt();
            System.out.println(numb);
        } catch (ArithmeticException e){
            System.out.println("You can't divide by zero here.");
        } catch (InputMismatchException e){
            System.out.println("That was NOT a number!");
        } catch (Exception e) {
            // safety net
            System.out.println("Something went wrong :(");
        } finally {
            System.out.println("We done here.");
        }



        scanner.close();


    }



}
