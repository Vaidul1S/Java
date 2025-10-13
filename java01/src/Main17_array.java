import java.util.Arrays;

public class Main17_array {

    public static void main(String[] args) {

        String[] fruits = {"Apple", "Greatfruit", "Orange", "Lime", "Pear"};

        int numbOfFruits = fruits.length;
        System.out.println(numbOfFruits);

        fruits[0] = "Banana";
        System.out.println(fruits[0]);

        Arrays.sort(fruits);
//        Arrays.fill(fruits, "Pineapple");

        for (int i = 0; i < numbOfFruits; i++) {
            System.out.print(fruits[i] + " ");
        }

        System.out.println();

        // foreach loop

        for(String fruit : fruits){
            System.out.println(fruit);
        }

    }


}
