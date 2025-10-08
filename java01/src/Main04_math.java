import java.util.Scanner;

public class Main04_math {
    public static void main(String[] args){

        double x = 15;
        double y = 7;
        double z;

        z = x + y;
        System.out.println(z);
        z = x - y;
        System.out.println(z);
        z = x * y;
        System.out.println(z);
        z = x / y;
        System.out.println(z);
        z = x % y;                      // liekana
        System.out.println(z);
        z += x;
        System.out.println(z);
        z--;
        System.out.println(z);

        // P E M D A S - veiksmu eiliskumas
        // parentheses(skliaustai), exponents (laipsniai), multiplication (daugyba), division (dalyba), addition (sudetis), subtraction(atimtis)

        double result = 3 + 4 * (7 - 5) / 2.0;
        System.out.println(result);
    }
}
