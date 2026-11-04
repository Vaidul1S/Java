import java.util.Scanner;

public class Main05_input {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '€';
        double total;

        System.out.println("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.println("What is a price for peace?: ");
        price = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("How many would you like to buy?: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\nYour total is: " + total + currency);

        scanner.close();

    }
}
