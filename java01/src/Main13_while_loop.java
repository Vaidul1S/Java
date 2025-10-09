import java.util.Scanner;

public class Main13_while_loop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String name = "";

        while(name.isEmpty()) {
            System.out.println("Enter you name");
            name = scanner.nextLine();
        }

        System.out.println("Hello, " + name);

        scanner.close();
    }
}
