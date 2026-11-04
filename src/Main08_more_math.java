import java.util.Scanner;

public class Main08_more_math {
    public static void main(String[] args){

        System.out.println(Math.PI);
        System.out.println(Math.E);

        double result;

        result = Math.pow(2, 3);
        System.out.println(result);

        result = Math.abs(-5);
        System.out.println(result);

        result = Math.sqrt(144);
        System.out.println(result);

        result = Math.round(3.14);
        System.out.println(result);

        result = Math.ceil(3.14);
        System.out.println(result);

        result = Math.floor(3.14);
        System.out.println(result);

        result = Math.min(10, 30);
        System.out.println(result);

        result = Math.max(10, 30);
        System.out.println(result);


        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the length of side A: ");
        a = scanner.nextDouble();
        System.out.print("Enter the length of side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The hypotenuse of the triangle is: " + c + " cm.");

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        System.out.printf("The circumference of the circle is %.2fcm\n", circumference);

        area = Math.PI * Math.pow(radius, 2);
        System.out.printf("The area of the circle is %.2fcm²\n", area );

        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.printf("The volume of the circle is %.2fcm³\n", volume);


        scanner.close();
    }
}
