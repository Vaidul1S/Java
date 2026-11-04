import java.util.Scanner;

public class Main44_multithreading {

    public static void main(String[] args) {

        // Multithreading

        Scanner scanner = new Scanner(System.in);

        Thread thread1 = new Thread(new MyRun("Ping"));
        Thread thread2 = new Thread(new MyRun("Pong"));

        System.out.println("Game start!");

        thread1.start();
        thread2.start();

        try{
            thread1.join();
        } catch (InterruptedException e) {
            System.out.println("Fan just hit shit!");
        }

        try{
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Fan just hit shit!");
        }

        System.out.println("Game over!");

        scanner.close();

    }

}
