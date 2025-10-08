import java.util.Scanner;

public class Main06_statements {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String name;
        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        int age;
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You may enter.");
        } else if (age < 0) {
            System.out.println("You might be dead on not born yet!");
        } else {
            System.out.println("You must be an adult to enter!");
        }

        if (name.isEmpty()) {
            System.out.println("You didn't enter you name!");
        } else {
            System.out.println("Hello, " + name);
        }

        scanner.close();

    }
}
