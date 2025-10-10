import java.util.Scanner;
import java.util.Random;

public class Number_guessing {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1);

        System.out.println("Welcome to the number guessing game!");
        System.out.printf("Guess a number between %d and %d: ", min, max);

        do{
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("Too low, try again!");
            } else if (guess > randomNumber) {
                System.out.println("Too high, rty again!");
            } else {
                System.out.println("Correct! The number was " + randomNumber);
            }

        }while (guess != randomNumber);

        System.out.println("You have won!!!");
        System.out.printf("You took %d attempt(s).", attempts);

        scanner.close();
    }
}