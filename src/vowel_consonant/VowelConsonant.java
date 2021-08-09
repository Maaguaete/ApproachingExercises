package vowel_consonant;
import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        char VC = sc.next().charAt(0);

        boolean check = false;
        switch (VC){
            case 'a':
            case 'o':
            case 'e':
            case 'i':
            case 'u':
            case 'A':
            case 'O':
            case 'E':
            case 'I':
            case 'U': check = true;
        }
        if(check ){
            System.out.println("This is a Vowel!");
            return;
        }
        if((VC >= 'a'&& VC<='z')||(VC >= 'A'&& VC<='Z'))
            System.out.println("This is a Consonant!");
        else
            System.out.println("Please enter a character!");
    }
}
