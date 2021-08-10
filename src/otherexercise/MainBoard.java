package otherexercise;

import java.util.Scanner;

public class MainBoard {
    public static void main(String[] args){

        System.out.print("""
                Some exercises!
                1. Adding 2 arrays.
                2. Transforming an ArrayList to an Array.
                3. Transposing a Matrix number.
                4. Displaying current time.
                5. Convert the time between second, minute and hour formats.
                Run line number:\s""");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch(choice) {
            case 1 -> {
                Add2Arrays do1 = new Add2Arrays();
                do1.manually();
                do1.arraycopy();
            }
            case 2 -> {
                Transform_ArrayListToArray do2 = new Transform_ArrayListToArray();
                do2.transform();
            }
            case 3 -> {
                TransposeMatrix do3 = new TransposeMatrix();
                do3.transpose();
            }
            case 4 -> {
                DisplayCurrentTime do4 = new DisplayCurrentTime();
                do4.displayCurrentTime();
            }
            case 5 -> {
                ConvertTimeFormat do5 = new ConvertTimeFormat();
                do5.convertTime();
            }

        }
    }
}
