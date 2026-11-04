import java.util.Scanner;

public class Main29_polymorphism {

    public static void main(String[] args) {

        // polymorphism

        Scanner scanner = new Scanner(System.in);

        Car car = new Car("BMW", "525", 2019, 30000);
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicles = {car, bike, boat};         // ta pati galima padaryti su interfacu

        for (Vehicle vehicle : vehicles){
            vehicle.go();
        }

        // runtime(dynamic) polymorphism

        Animal animal;

        System.out.print("Would you like to create a dog or a cat class? (1. dog / 2. cat): ");
        int choice = scanner.nextInt();

        if(choice == 1){
            animal = new Dog();
            animal.speak();
        } else if(choice == 2) {
            animal = new Cat();
            animal.speak();
        } else {
            System.out.println("Invalid choice.");
        }



        scanner.close();


    }



}
