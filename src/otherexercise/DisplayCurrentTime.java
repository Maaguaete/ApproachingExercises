package otherexercise;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DisplayCurrentTime {

    void displayCurrentTime(){

        LocalDateTime current = LocalDateTime.now();
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("HH:mm:ss.S, ddMMMyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

        System.out.println("Current time 1 is: "+ current.format(formatter1));
        System.out.println("Current time 2 is: "+ current.format(formatter2));
    }
}