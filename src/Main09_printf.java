import java.util.Scanner;

public class Main09_printf {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // %[flags][width][.precision][specifier-character]

        String name = "Ella";
        char firstLetter = 'E';
        int age = 17;
        double height = 158.3;
        boolean isSinger = true;

        System.out.printf("Hello %s\n", name);                                  // %s for string
        System.out.printf("Your name starts with letter %c\n", firstLetter);    // %c for char
        System.out.printf("You are %d years old\n", age);                       // %d for int
        System.out.printf("Your are %.2f cm tall\n", height);                   // %f for double
        System.out.printf("Singer: %b\n", isSinger);                            // %b for bool

        System.out.printf("%s id %d years old.\n", name, age);

        double price1 = 10000.99;
        double price2 = -5500.03;

        System.out.printf("%,+.2f\n", price1);
        System.out.printf("%+,.2f\n", price2);


        scanner.close();
    }
}
