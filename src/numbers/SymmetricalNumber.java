package numbers;

import java.util.Scanner;

public class SymmetricalNumber {

    void symmetricalNumber(){

        System.out.print("Input a numbers: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int origin = N;
        int reversednum = 0;

        while(N!=0){
            int temp = N%10;
            reversednum = reversednum*10 + temp;
            N /= 10;
        }
        if(reversednum == origin){
            System.out.println("This is a symmetrical number!");
        } else
            System.out.println("This is not a symmetrical number!");
    }
}
