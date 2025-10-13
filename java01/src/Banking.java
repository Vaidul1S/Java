import java.util.Scanner;

public class Banking {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double balance = 1000.90;
        boolean isRunning = true;
        int choice;
        double amount;
        while (isRunning) {

            System.out.println("***************");
            System.out.println("Banking Program");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> System.out.println("Show balance");
                case 2 -> System.out.println("Deposite");
                case 3 -> System.out.println("Withdraw");
                case 4 -> System.out.println("Exit");
                default -> System.out.println("Invalid choice!");

            }
        }
        showBalance(balance);
        deposite();
        withdraw();
        exit();


        scanner.close();
    }
    static void showBalance(double balance){
        System.out.printf("\n€ %.2f\n", balance);
    }
}
