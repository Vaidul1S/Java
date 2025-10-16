import java.util.Random;
import java.util.Scanner;

public class Slot_Machine {
    static String[] symbols = {"🍓", "🍊", "🍒", "🔔", "⭐", "🍋"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("\nWelcome to the Slots Game!\n");

        String playAgain = "yes";
        double balance = 100;
        double bet;
        double payout;


       while (balance > 0){
           System.out.println("Current balance: € " + balance);
           System.out.print("Place your bet: ");
           bet = scanner.nextDouble();

           if (bet > balance){
               System.out.println("Insufficient funds!");
               continue;
           } else if (bet <= 0) {
               System.out.println("Bet must be greater than zero!");
               continue;
           } else {
               balance -= bet;
           }

           System.out.println("\nSpinning...");
           String[] row = spinRow();
           printRow(row);
           payout = getPayout(row, bet);

           if (payout > 0){
               System.out.println("You won € " + payout);
               balance += payout;
           } else {
               System.out.println("Sorry, try again");
           }

       }

        System.out.println("Thank you for playing 💖");


        scanner.close();
    }

    static String[] spinRow(){
        String[] row = new String[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
    }

    static void printRow(String[] row){
        System.out.println(" " + String.join(" | ", row));
    }

    static double getPayout(String[] row, double bet){
        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch (row[0]){
                case "🍓" -> bet * 3;
                case "🍊" -> bet * 4;
                case "🍒" -> bet * 2;
                case "🔔" -> bet * 10;
                case "⭐" -> bet * 20;
                case "🍋" -> bet * 5;
                default -> 0;
            };
        }
        return 0;
    }

}
