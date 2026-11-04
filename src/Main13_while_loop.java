import java.util.Scanner;

public class Main13_while_loop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String name = "";

        while(name.isEmpty()) {
            System.out.println("Enter you name");
            name = scanner.nextLine();
        }

        System.out.println("Hello, " + name);

        String entry = "";

        do {
            System.out.println("You are playing a game!");
            System.out.println("Enter 'Q' to quit!");
            entry = scanner.nextLine().toUpperCase();
        } while (!entry.equals("Q"));

        System.out.printf("Thanks for playing, %s!", name);

        scanner.close();
    }
}
