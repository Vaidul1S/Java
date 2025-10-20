import java.util.Scanner;

public class Main26_method_overriding {

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        dog.moves();
        cat.moves();
        fish.moves();

        scanner.close();


    }



}
