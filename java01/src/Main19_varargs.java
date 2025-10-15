import java.util.Scanner;

public class Main19_varargs {

    public static void main(String[] args) {

        // varargs - allow a method to accept a varying number of arguments
        // no need to overloaded methods!

        Scanner scanner = new Scanner(System.in);

        System.out.println(add(1,2,3,4,5,6,7));
        System.out.println(average(1,2,3,4,5,6,7));
        System.out.println(average());


        scanner.close();
    }

    static int add(int... numbers){
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    static double average(double... numbers){
        double sum = 0;

        for (double number:numbers){
            sum += number;
        }
        double average = sum / numbers.length;
        return average;
    }

}
