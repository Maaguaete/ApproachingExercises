package string;

import java.util.Scanner;

public class UpperCase1stLetter {

    void upFirstLetter(){

        System.out.print("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        //
        char[] arrChar = input.toCharArray();
        arrChar[0] = Character.toUpperCase(arrChar[0]);

        for(int i=1;i<arrChar.length;i++) {
            if(arrChar[i]==' '){
                arrChar[i+1] = Character.toUpperCase(arrChar[i+1]);
            }
        }
        //
        input = String.valueOf(arrChar);
        System.out.println("After upperCase: "+input);
    }
}
