import java.util.Scanner;

public class Main28_interface {

    public static void main(String[] args) {

        // Interface - a blueprint for a class that specifies a set of abstract methods
        // that implementing classes must define.
        // Supports multiple inheritance like behavior.

        Scanner scanner = new Scanner(System.in);

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();

        fish.flee();
        fish.hunt();



        scanner.close();


    }



}
