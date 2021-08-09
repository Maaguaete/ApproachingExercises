package string;

import java.util.Scanner;

public class EraseWhiteSpace {

    void Erase(){

        System.out.print("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        //
        System.out.println("String before erase: "+input);
        input = input.replaceAll("\\s+", "_");
        System.out.println("String after erase: "+input);
    }
}
