package string;

import java.util.Scanner;
import java.util.Stack;

public class ReverseEachWord {

    void reverseWord(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String you want to reverse: ");
        String str = sc.nextLine();

        String[] words = str.split(" "); // split the STRING sentence into WORDS.
        String reverseEachWord = ""; // Set an empty string for the Output Result.

        for(int i=0; i < words.length; i++){

            String rev_1word = ""; // Set an empty string to store EACH reverse word.

            for(int j=words[i].length()-1 ; j>=0 ; j-- )
            {
                rev_1word += words[i].charAt(j);
            }
            reverseEachWord += rev_1word + " ";
        }

        System.out.println("\n"+reverseEachWord);
    }

}
