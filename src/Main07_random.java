import java.util.Random;

public class Main07_random {
    public static void main(String[] args) {

        Random rand = new Random();

        int number1;
        double number2;
        boolean isHeads;

        number1 = rand.nextInt(1, 7);            // randomas nuo 1 iki 6 imtinai
        number2 = rand.nextDouble(1, 100);
        isHeads = rand.nextBoolean();

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(isHeads);

    }
}
