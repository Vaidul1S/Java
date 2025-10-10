import java.util.Scanner;

public class Main14_for_loop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String name = "";

        for(int i = 0; i < 10; i++){
            System.out.printf("%d. Pizza ", i + 1);
        }


        scanner.close();
    }
}
