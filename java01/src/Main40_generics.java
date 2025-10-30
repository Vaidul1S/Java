import java.util.ArrayList;

public class Main40_generics {

    public static void main(String[] args) {

        // Generics - a concept where you can write a class, interface, or method that is compatible with different data types
        // ArrayList is a generic, <T> T - type
        // <T, U> U - type tik kad alfabetas toliau butu V ir tt.

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("pear");
        System.out.println(fruits);

        Box<String> box = new Box<>();

        box.setItem("greatfruit");
        System.out.println(box.getItem());

        Product<String, Double> product1 = new Product<>("banana", 1.49);
        System.out.println(product1.getItem());
        System.out.println(product1.getPrice() + " €");

        Product<String, Double> product2 = new Product<>("orange", 0.99);
        System.out.println(product2.getItem());
        System.out.println(product2.getPrice() + " €");


    }



}
