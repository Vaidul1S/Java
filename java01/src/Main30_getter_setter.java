public class Main30_getter_setter {

    public static void main(String[] args) {

        // Getter Setter

        Car car1 = new Car("BMW", "745", 2019, 30000);
        System.out.printf("%s %s year: %d price: %,.2f €\n", car1.getBrand(), car1.getModel(), car1.getYear(), car1.getPrice());

        car1.setYear(2022);
        car1.setPrice(-35000);

        System.out.println(car1.getBrand() + " " + car1.getModel() + " " + car1.getYear() + " " + car1.getPrice() + " €");

        Car car2 = new Car("Chevrolet", "Corvette", 2020, 40000);
        car2.setYear(2022);
        car2.setPrice(37999.99);
        System.out.printf("%s %s year: %d price: %,.2f €\n", car2.getBrand(), car2.getModel(), car2.getYear(), car2.getPrice());


    }



}
