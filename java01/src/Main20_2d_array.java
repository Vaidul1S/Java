import java.util.Scanner;

public class Main20_2d_array {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] fruits = {"Apple", "Greatfruit", "Orange", "Lime", "Pear", "Banana"};
        String[] vegetables = {"Potato", "Onion", "Carrot"};
        String[] meats = {"Chicken", "Beef", "Pork", "Lamb"};

        String[][] groceries = {fruits, vegetables, meats};

        for(String[] foods : groceries){
            System.out.println(foods);
        }

        scanner.close();
    }



}
