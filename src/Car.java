public class Car extends Vehicle {
    private final String brand;
    private final String model;
    private int year;
    private double price;
    boolean isWorking = false;

    Car(String brand, String model, int year, double price){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    @Override
    public String toString(){
        return this.brand + " " + this.model + " " + this.year + " " + this.price + " €";
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

    @Override
    void go(){
        System.out.println("You drive the car.");
    }

    String getBrand(){
        return this.brand;
    }

    String getModel(){
        return this.model;
    }

    int getYear(){
        return this.year;
    }

    double getPrice(){
        return this.price;
    }

    void setYear(int year){
        this.year = year;
    }

    void setPrice(double price){
        if(price < 0){
            System.out.println("Price can't be less than zero.");
        } else {
            this.price = price;
        }
    }

}
