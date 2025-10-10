import java.util.Scanner;

public class Main16_overloaded_method {
    public static void main(String[] args) {
        // same name, different params = signature

        Scanner scanner = new Scanner(System.in);

        System.out.println(add(1, 8));
        System.out.println(add(2, 4, 22));

        String pizza1 = makeApizza("thin bread");
        System.out.println(pizza1);

        String pizza2 = makeApizza("thin bread", "mozzarella");
        System.out.println(pizza2);

        String pizza3 = makeApizza("thin bread", "mozzarella", "ham");
        System.out.println(pizza3);

        String topping;
        String cheese;
        String bread;

        System.out.println("Enter a topping: ");
        topping = scanner.nextLine();

        System.out.println("Enter a cheese: ");
        cheese = scanner.nextLine();

        System.out.println("Enter a bread: ");
        bread = scanner.nextLine();

        String pizza4 = makeApizza(bread, cheese, topping);
        System.out.println(pizza4);


        scanner.close();
    }
    static double add(double a, double b){
        return a + b;
    }
    static double add(double a, double b, double c){
        return a + b + c;
    }
    static String makeApizza(String bread){
        return bread + " pizza";
    }
    static String makeApizza(String bread, String cheese){
        return cheese + " " + bread + " pizza";
    }
    static String makeApizza(String bread, String cheese, String topping){
        return topping + " " + cheese + " " + bread + " pizza";
    }


}
