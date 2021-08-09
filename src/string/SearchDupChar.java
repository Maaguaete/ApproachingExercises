package string;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class SearchDupChar {

    void searchDupChar() {

        System.out.print("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        char[] arrChar = inputString.toCharArray();

        outer: for (int i = 0; i < arrChar.length; i++)
        {
            int count = 0;
            for (int j = 0; j < arrChar.length; j++) {

                if((j<i)&&(arrChar[j]==arrChar[i])) // Kiem tra ky tu hien tai cua i da check chua
                {
                    continue outer; // ky tu [i] = ky tu [j] => checked => back to loop for(i)
                }
                if (arrChar[i] == arrChar[j]) // so sanh tiep tuc
                {
                    count++;
                }
            }
            // Only print out characters counted more than once.
            //if (count > 1) {
                System.out.println("Duplicated letter: \"" + arrChar[i] + "\"    " + count);
            //}
        }
    }
}

//        HashMap<Character, Integer> dupchar = new HashMap<>();
//
//        // Scan the arrChar[] and plus 1 to the dupchar map's value if meet duplicated chracter.
//        for (Character a : arrChar) {
//            if (dupchar.containsKey(a)) {
//                dupchar.put(a, dupchar.get(a) + 1);
//            } else
//                dupchar.put(a, 1);
//        }
//        // Take out only the Key of dupchar hashmap;
//        // Assign to output
//        Set<Character> output = dupchar.keySet();
//
//        for (Character a : output) {
//            if (dupchar.get(a) > 1) {
//                System.out.println("Duplicated letter:    \"" + a + "\"    " + dupchar.get(a));
//            }
//        }
//    }
//}