import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main39_timer {

    public static void main(String[] args) {

        // Timer - class that schedules tasks at specific times of periodically
        // TimerTask - the task that will executed be the timer
        // yuo will extend the TimeTask class to define your task create a subclass of TimeTask and override run()


        Scanner scanner = new Scanner(System.in);

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = 3;
            @Override
            public void run() {
                System.out.println("Hello, Bebras!");
                count--;
                if(count <= 0){
                    System.out.println("Task completed.");
                    timer.cancel();
                }
            }
        };

        timer.schedule(task, 1000, 1000);


        scanner.close();


    }



}
