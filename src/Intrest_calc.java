import java.util.Scanner;

public class Intrest_calc {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timeCompound;
        int years;
        double amount;

        System.out.print("Enter principle amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble()/100;

        System.out.print("Enter the number of time compounded per year: ");
        timeCompound = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate/timeCompound, timeCompound * years);

        System.out.printf("The amount after %d years is %,.2f €", years, amount);


        scanner.close();
    }
}
