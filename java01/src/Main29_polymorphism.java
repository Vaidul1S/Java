import java.util.Scanner;

public class Main29_polymorphism {

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        Car car = new Car("BMW", "525", 2019, 30000);
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicles = {car, bike, boat};         // ta pati galima padaryti su interfacu

        for (Vehicle vehicle : vehicles){
            vehicle.go();
        }


        scanner.close();


    }



}
