import java.util.Scanner;

public class Main15_method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name1 = "Jisoo";
        String name2 = "Rose";


        daddyJoke(name1);
        daddyJoke(name2);

        System.out.print("Enter a number to square: ");
        double num1 = scanner.nextDouble();
        System.out.println(square(num1));

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if(ageCheck(age)){
            System.out.println("You may enter.");
        } else {
            System.out.println("Freak off!");
        }


        scanner.close();
    }
    static void daddyJoke(String name){
        System.out.printf("Dear, %s!\nWhy don’t graveyards ever get overcrowded?\nBecause people are dying to get in.\n\n", name);
    }

    static double square(double number){
        return number * number;
    }

    static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        } else {
            return false;
        }
    }
}
