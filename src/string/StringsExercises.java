package string;

import java.util.Scanner;

public class StringsExercises {

    public static void main(String[] args){

        System.out.print("""
                Type the number below for the method being executed:\s
                1. Uppercase the first letters of the Strings.
                2. Uppercase all the letters of the whole sentence.
                3. Lowercase all the letters of the whole sentence.
                4. Search and display the duplicated letters in the sentence.
                5. Check symmetry.
                6. Sort the Strings Alphabetically.
                7. Reverse each word in a Sentence .
                8. Count the Vowels and Consonants in a sentence .
                *. Input your the magic number here :\s""");

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        switch (i){
            case 1:
                UpperCase1stLetter up = new UpperCase1stLetter();
                up.upFirstLetter();
                break;
            case 2:
                UpperCaseAll upall = new UpperCaseAll();
                upall.upAll();
                break;
            case 3:
                LowerCaseAll lowall = new LowerCaseAll();
                lowall.lowAll();
                break;
            case 4:
                SearchDupChar search = new SearchDupChar();
                search.searchDupChar();
                break;
            case 5:
                SymmetricalString mirror = new SymmetricalString();
                mirror.checkSymmetry();
                break;
            case 6:
                SortStringAlphabetically sort = new SortStringAlphabetically();
                sort.sortString();
            case 7:
                ReverseEachWord revW = new ReverseEachWord();
                revW.reverseWord();
            case 8:
                countVowelConsonant countvc = new countVowelConsonant();
                countvc.countVC();

        }

    }

}
