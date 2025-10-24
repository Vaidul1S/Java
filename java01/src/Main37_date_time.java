import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main37_date_time {

    public static void main(String[] args) {

        // Date and time

        Scanner scanner = new Scanner(System.in);

        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);

        Instant instant = Instant.now();
        System.out.println(instant);

        // custom format

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);

        LocalDateTime dateTime1 = LocalDateTime.of(2020, 3, 17, 0, 0, 0);
        LocalDateTime dateTime2 = LocalDateTime.of(2019, 11, 17, 0, 1, 2);
        System.out.println(dateTime1);
        System.out.println(dateTime2);

        if(dateTime1.isBefore(dateTime2)){
            System.out.println(dateTime1 + " is earlier than " + dateTime2);
        }
        else if (dateTime1.isAfter(dateTime2)) {
            System.out.println(dateTime1 + " is latter than " + dateTime2);
        }
        else if (dateTime1.isEqual(dateTime2)) {
            System.out.println(dateTime1 + " is equal to " + dateTime2);
        }


        scanner.close();


    }



}
