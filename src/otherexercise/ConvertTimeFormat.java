package otherexercise;

import java.util.Scanner;

public class ConvertTimeFormat {

    void secondOutput(int hours, int minutes){ // Changing from HH-MM to Seconds.
        System.out.format("After converting: %,3d seconds.",hours * 3600 + minutes * 60 );
    }
    void hourOutput(int seconds){ // Changing from seconds to HH-MM format.

        int hours, minutes;
        hours = seconds/3600;
        minutes = (seconds%3600)/60;
        System.out.format("After converting: %dh:%dm:%ds", hours, minutes,seconds%3600%60);
    }
    void convertTime(){
        System.out.print("1. Convert from hours, minutes to seconds.\n2. Convert from seconds to hours, minutes.");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if(choice == 1){
            System.out.print("Input hours: ");
            int hours = sc.nextInt();
            System.out.print("Input minutes: ");
            int minutes = sc.nextInt();
            secondOutput(hours, minutes);
        } else if (choice == 2){
            System.out.print("Input seconds: ");
            int seconds = sc.nextInt();
            hourOutput(seconds);
        }
    }
}
