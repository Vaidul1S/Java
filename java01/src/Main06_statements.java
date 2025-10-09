import java.util.Scanner;

public class Main06_statements {
    public static void main(String[] args){

        // && || != - all same, but == (there is no ===)

        Scanner scanner = new Scanner(System.in);

        String name;
        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        int age;
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        if (age >= 18 && age <= 65) {
            System.out.println("You may enter.");
        } else if (age < 0) {
            System.out.println("You might be dead on not born yet!");
        } else if (age > 65) {
            System.out.println("Consult your doctor first.");
        } else {
            System.out.println("You must be an adult to enter!");
        }

        if (name.isEmpty()) {
            System.out.println("You didn't enter you name!");
        } else {
            System.out.println("Hello, " + name);
        }

        // ternary - taip pat

        String noname = name.isEmpty() ? "You didn't enter your name" : name;
        System.out.println(noname);

        String check = age >= 18 ? "Pass" : "Get out!";
        System.out.println(check);

        scanner.close();

    }
}
