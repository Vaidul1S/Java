import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("\nWelcome to the KaiBaiBo Game!\n");

        String playAgain = "yes";
        String[] options = {"rock", "paper", "scissors"};

        do {
            System.out.print("Enter you choice: ");
            String player = scanner.nextLine();

            if(!player.equals("rock") && !player.equals("paper") && !player.equals("scissors")){
                System.out.println("Invalid choice!");
                continue;
            }

            String computer = options[random.nextInt(3)];
            System.out.println("Computer picked: " + computer);

            if(player.equals(computer)){
                System.out.println("It's a tie!");
            } else if (player.equals("rock") && computer.equals("scissors")) {
                System.out.println("You win!");
            } else if (player.equals("paper") && computer.equals("rock")) {
                System.out.println("You win!");
            } else if (player.equals("scissors") && computer.equals("paper")) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            System.out.println("Play again(yes/no)?: ");
            playAgain = scanner.nextLine().toLowerCase();
        } while (playAgain.equals("yes"));

        System.out.println("Thank you for playing 💖");


        scanner.close();
    }



}
