package otherexercise;

import java.util.Scanner;

public class ASCIIValueOfChar {

    void displayASCII(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a character: ");
        char ch = sc.next().charAt(0);
        System.out.printf("The ASCII value of '%c' is: %d",ch,(int)ch);
    }
}
