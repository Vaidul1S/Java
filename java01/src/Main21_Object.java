public class Main21_Object {

    public static void main(String[] args) {

        // Object = an entity that holds data (attributes)

        Car car = new Car("Lamborghini", "Ursus", 2025, 460300.99);

        System.out.println(car.getBrand());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        System.out.println(car.getPrice());

        car.start();
        System.out.println(car.isWorking);

        car.stop();
        System.out.println(car.isWorking);

        car.drive();

        Person person1 = new Person("Ella", 17, 156.5);
        Person person2 = new Person("Ga Won", 23, 171.3);

        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.height);
        System.out.println(person1.isCelebrity);
        person1.sing();

        System.out.println(person2.name);
        System.out.println(person2.age);
        System.out.println(person2.height);
        System.out.println(person2.isCelebrity);
        person2.sing();


    }



}
