import java.util.Scanner;

public class Temp_converter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double temp;
        double convertedTemp;
        String choice;

        System.out.println("Welcome to the Temperature converter ⚖️");
        System.out.print("Enter the temperature convert: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celsius of Fahrenheit? (C or F): ");
        choice = scanner.next().toUpperCase();

        convertedTemp = choice.equals("C") ? (temp - 32) / 1.8 : (temp * 1.8) + 32;

        System.out.printf("%.1f %s",convertedTemp, choice);


        scanner.close();
    }
}