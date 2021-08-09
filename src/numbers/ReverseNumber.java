package numbers;

import java.util.Scanner;

public class ReverseNumber {

    void reverseNum(){

        System.out.print("Input a numbers: ");
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        int reversenum = 0;

        while(Number!=0){
            int temp = Number%10;
            reversenum = reversenum*10+temp;
            Number/=10;
        }
        System.out.printf("The number %d after revesed is: %d", Number, reversenum);
    }
}
