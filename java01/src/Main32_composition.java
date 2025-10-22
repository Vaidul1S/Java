import java.util.Scanner;

public class Main32_composition {

    public static void main(String[] args) {

        // Composition - Represents a part of relationship between objects.
        // Allows complex objects to be constructed from smaller objects.

        Scanner scanner = new Scanner(System.in);

        Rocket rocket1 = new Rocket("Saturn 5", 1960, "F1");

        System.out.println(rocket1.model);
        System.out.println(rocket1.year);
        System.out.println(rocket1.engine.brand);


        scanner.close();


    }



}
