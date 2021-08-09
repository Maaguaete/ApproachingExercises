package string;

import java.util.Locale;
import java.util.Scanner;

public class countVowelConsonant {
    void countVC(){

        int vcount = 0;
        int ccount = 0;
        System.out.println("Type your sentence here: ");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        sentence = sentence.toLowerCase();
        for(int i=0;i<sentence.length();i++){
            char letter = sentence.charAt(i);
            if((letter == 'a')||(letter == 'e')||(letter == 'o')
                    ||(letter == 'i')||(letter == 'u')){
                vcount++;
            } else if((letter>'a')&&(letter<='z')){
                ccount++;
            }
        }
        System.out.println("Number of Vowels: "+vcount+"\nNumber of Consonants: "+ccount);
    }
}
