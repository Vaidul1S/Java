import java.util.Scanner;

public class Main10_nested_statements {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean isAlive = false;
        boolean isStudent = false;
        double price = 99.99;

        if(isAlive){
            System.out.println("You can go to the concert.");
            System.out.println("You get an alive discount of 10%");
            price *= 0.9;

            if(isStudent){
                System.out.println("You get an alive discount of 20%");
                price *= 0.8;
            }
        } else {
            System.out.println("Freak off!");
            price *= 1;
        }

        System.out.printf("Your ticket price is € %.2f", price);

        scanner.close();
    }
}
