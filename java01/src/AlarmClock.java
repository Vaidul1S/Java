import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AlarmClock {

    public static void main(String[] args) {

        // Java Alarm Clock

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Java Alarm Clock");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarTime = null;
        String filePath = "src\\sample.wav";

        while (alarTime == null){
            try{
                System.out.print("Enter an alarm time (HH:mm:ss): ");
                String inputTime = scanner.nextLine();

                alarTime = LocalTime.parse(inputTime, formatter);
                System.out.println("Alarm set for " + alarTime);
            }
            catch (DateTimeParseException e){
                System.out.println("Invalid time format!");
            }
        }

        Alarm alarm = new Alarm(alarTime, filePath, scanner);
        Thread alarmThread = new Thread(alarm);
        alarmThread.start();


    }

}
