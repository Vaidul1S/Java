public class Car {
    String make = "Audi";
    String model = "A8";
    int year = 2025;
    double price = 60300.99;
    boolean isWorking = false;

    void start(){
        isWorking = true;
        System.out.println("You start the engine.");
    }
    void stop(){
        isWorking = false;
        System.out.println("You stop the engine.");
    }
    void drive(){
        isWorking = true;
        System.out.printf("You took %s for a spin.\n", model);
    }

}
