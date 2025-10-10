import java.util.Scanner;

public class Main14_for_loop {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        String name = "";

        for(int i = 0; i < 5; i++){
            System.out.printf("%d. Pizza ", i + 1);
            System.out.println(" ");
        }

        System.out.print("How many times you want to loop?: ");
        int max = scanner.nextInt();

        for (int i = max; i > 0; i--){
            System.out.println(i);
            Thread.sleep(500);
        }

        System.out.println("Happy new year!!!");

        scanner.close();
    }
}
