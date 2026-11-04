import java.util.Scanner;

public class Main02 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old.");
        scanner.nextLine();         // kad ne imtu kitos eilutes

        System.out.println("What car are you driving?");
        String car = scanner.nextLine();
        System.out.println("I like " + car + " brand.");

        System.out.println("Are you from Twitch? ");
        boolean streamer = scanner.nextBoolean();
        System.out.println("You are a streamer!");

        scanner.close();

    }
}
