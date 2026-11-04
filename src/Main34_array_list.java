import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main34_array_list {

    public static void main(String[] args) {

        // ArrayList = a resizeable array that stores objects (autoboxing)
        // Arrays are fixed size, but ArrayList CAN CHANGE


        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(1);
        list.add(11);

        System.out.println(list);

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Greatfruit");
        fruits.add("Banana");
        fruits.add("Plum");
        fruits.add("Lemon");

        // fruits.remove(4);
        fruits.set(4, "Pineapple");
        fruits.add("Coconut");

        System.out.println(fruits);
        System.out.println(fruits.get(3));
        System.out.println(fruits.size());

        Collections.sort(fruits);
        System.out.println(fruits);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter number of food you would like?: ");
        int numb = scanner.nextInt();
        scanner.nextLine();
        for(int i = 1; i <= numb; i++){
            System.out.println("Enter food #" + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);

        scanner.close();


    }



}
