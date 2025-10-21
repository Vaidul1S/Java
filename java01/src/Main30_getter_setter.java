import java.util.Scanner;

public class Main30_getter_setter {

    public static void main(String[] args) {

        // Getter Setter

        Scanner scanner = new Scanner(System.in);

        Car car = new Car("BMW", "745", 2019, 30000);

        car.setYear(2022);
        car.setPrice(-35000);

        System.out.println(car.getBrand() + " " + car.getModel() + " " + car.getYear() + " " + car.getPrice() + " €");



        scanner.close();


    }



}
