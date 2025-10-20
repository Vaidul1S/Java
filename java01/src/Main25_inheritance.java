import java.util.Scanner;

public class Main25_inheritance {

    public static void main(String[] args) {

        // parent -> child, kaip C#
        Scanner scanner = new Scanner(System.in);

        Dog gucci = new Dog();
        Cat puga = new Cat();

        gucci.eat();
        puga.eat();

        gucci.speak();
        puga.speak();

        scanner.close();


    }



}
