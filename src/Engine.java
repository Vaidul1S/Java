public class Engine {
    String brand;

    Engine(String brand){
        this.brand = brand;
    }

    void start(){
        System.out.println("You start the " + this.brand + " engine.");
    }
}
