import java.util.Random;
import java.util.Scanner;

public class Slot_Machine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("\nWelcome to the Slots Game!\n");

        String playAgain = "yes";

        do {


            System.out.println("Play again(yes/no)?: ");
            playAgain = scanner.nextLine().toLowerCase();
        } while (playAgain.equals("yes"));

        System.out.println("Thank you for playing 💖");


        scanner.close();
    }



}
