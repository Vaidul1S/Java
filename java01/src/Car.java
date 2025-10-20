public class Car {
    String make = "Lamborghini";
    String model = "Murcielago";
    int year = 2025;
    double price = 460300.99;
    boolean isWorking = false;

    Car(String make, String model, int year, double price){
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    @Override
    public String toString(){
        return this.make + " " + this.model + " " + this.year + " " + this.price + " €";
    }

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
