package string;

import java.util.Scanner;


public class SymmetricalString {

    void checkSymmetry(){

        System.out.print("Write a string: ");
        Scanner sc = new Scanner(System.in);
        String inputstring = sc.nextLine();

        // Create a stack collection due to its L-I-F-O function.
        String backString = ("");

        // Store each character item of input-string to the stack.
        for(int i=inputstring.length()-1 ; i >= 0;i--)
        {
            backString += inputstring.charAt(i);
        }
        System.out.println("inputString "+inputstring);
        System.out.println("backString " +backString);

        if(inputstring.equals(backString))
        {
            System.out.println("\nThis is a symmetrical string!");
        } else
            System.out.println("\nThis is not a symmetrical string!");
    }
}
