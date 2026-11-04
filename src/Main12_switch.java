import java.util.Scanner;

public class Main12_switch {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String day;
        System.out.print("Enter a day: ");
        day = scanner.nextLine();

        switch (day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It is a workday 🤬");
            case "Saturday", "Sunday" -> System.out.println("It is a weekend 🌞");
            default -> System.out.println(day + " is not a day, are you tripping boy?");

        }

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean valid = true;

        System.out.print("Enter number one: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter an operator ('+'. '-', '*', '/', '^): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter number two: ");
        num2 = scanner.nextDouble();

        switch (operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if(num2 == 0) {
                    System.out.println("You cant divide by 0 here ☹️");
                    valid = false;
                } else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid operator!");
                valid = false;
            }

        }

        if (valid) {
            System.out.println(num1 + " " + operator + " " + num1 + " = " + result);
        }


        scanner.close();

    }
}
