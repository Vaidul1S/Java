import java.util.Scanner;

public class Main43_threading {

    public static void main(String[] args) {

        // Threading - multiple task simultaneously
        // How to create a Thread
        // 1. Extend the Thread class (simple, limited)
        // 2. Implement the runnable interface (better)

        Scanner scanner = new Scanner(System.in);

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);
        thread.start();


        System.out.println("You have 5 seconds to answer");
        System.out.print("Enter you name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name +"!");



        scanner.close();


    }



}
