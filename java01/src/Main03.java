import java.util.Scanner;

public class Main03 {
    public static void main(String[] args){

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the width: ");
        width = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter the height: ");
        height = scanner.nextDouble();
        scanner.nextLine();

        area = width * height;

        System.out.println("The area is : " + area + "cm²");

        scanner.close();

    }
}
