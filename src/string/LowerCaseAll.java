package string;

import java.util.Scanner;

public class LowerCaseAll {

    void lowAll() {
        System.out.print("Say something: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] arrChar = input.toCharArray();

        for (int i = 0; i < arrChar.length; i++) {
            arrChar[i] = Character.toLowerCase(arrChar[i]);
        }
        input = String.valueOf(arrChar);
        System.out.println("After uppercase whole sentence: " + input);
    }
}
