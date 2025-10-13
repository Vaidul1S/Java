import java.util.Arrays;
import java.util.Scanner;

public class Main17_array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] fruits = {"Apple", "Greatfruit", "Orange", "Lime", "Pear"};

        int numbOfFruits = fruits.length;
        System.out.println(numbOfFruits);

        fruits[0] = "Banana";
        System.out.println(fruits[0]);

        Arrays.sort(fruits);
        // Arrays.fill(fruits, "Pineapple");

        // enhanced loop  or foreach loop

        for(String fruit : fruits){
            System.out.println(fruit);
        }

        String[] foods;
        System.out.print("What number of food do you want?: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];

        for (int i = 0; i < foods.length; i++){
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        for(String food: foods){
            System.out.print(food + " ");
        }


        scanner.close();
    }


}
