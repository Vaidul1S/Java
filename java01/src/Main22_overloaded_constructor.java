import java.util.Scanner;

public class Main22_overloaded_constructor {

    public static void main(String[] args) {

        // Object = an entity that holds data (attributes)

        Scanner scanner = new Scanner(System.in);

        // allow class to have multiple constructors wih different params

        User user1 = new User("Sooin");
        System.out.println(user1.name);
        System.out.println(user1.email);
        System.out.println(user1.age);

        User user2 = new User("Narin", "fake2@example.com");
        System.out.println(user2.name);
        System.out.println(user2.email);
        System.out.println(user2.age);

        User user3 = new User("Anna", "fake3@example.com", 25);
        System.out.println(user3.name);
        System.out.println(user3.email);
        System.out.println(user3.age);

        User user4 = new User();
        System.out.println(user4.name);
        System.out.println(user4.email);
        System.out.println(user4.age);


        scanner.close();


    }



}
