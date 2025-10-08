import java.util.Scanner;

public class Weight_converter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int choice;
        double weight;
        double convertedWeight;

        System.out.println("Welcome to the weight converter ⚖️");
        System.out.println("Enter your choice: ");
        System.out.println("1. Convert lbs to kgs");
        System.out.println("2. Convert kgs to lbs");
        choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter the weight in lbs to convert to kgs: ");
            weight = scanner.nextDouble();
            convertedWeight = weight * 0.453592;
            System.out.printf("%.0f is equal to %.2f kgs.", weight, convertedWeight);
        } else if (choice == 2) {
            System.out.print("Enter the weight in kgs to convert to lbs: ");
            weight = scanner.nextDouble();
            convertedWeight = weight / 0.453592;
            System.out.printf("%.0f is equal to %.2f lbs.", weight, convertedWeight);
        } else {
            System.out.println("Wrong choice, pal!");
        }


        scanner.close();
    }
}