import java.util.Scanner;

public class Main26_method_overriding {

    public static void main(String[] args) {

        // method overriding

        Scanner scanner = new Scanner(System.in);

        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        dog.moves();
        cat.moves();
        fish.moves();

        Car car1 = new Car("Ford", "F150", 2010, 30000);
        System.out.println(car1);
        Car car2 = new Car("Chevrolet", "Corvette", 2022, 50000);
        System.out.println(car2);

        scanner.close();


    }



}
