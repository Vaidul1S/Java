import java.util.Scanner;

public class Banking {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        double balance = 1000.90;
        boolean isRunning = true;
        int choice;
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
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice!");

            }
        }


        scanner.close();
    }
    static void showBalance(double balance){
        System.out.printf("\n€ %.2f\n\n", balance);
    }

    static  double deposit(){
        double amount;
        System.out.print("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();
        if (amount <= 0){
            System.out.println("Invalid amount!");
            return 0;
        } else {
            return amount;
        }
    }

    static double withdraw(double balance){
        double amount;
        System.out.print("Enter an amount to be withdrawn: ");
        amount = scanner.nextDouble();

        if (amount > balance){
            System.out.println("Insufficient funds.");
        } else if (amount < 0){
            System.out.println("Amount can't be negative.");
        } else {
            return amount;
        }
        return 0;
    }

}
