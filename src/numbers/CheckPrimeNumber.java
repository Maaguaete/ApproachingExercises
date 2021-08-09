package numbers;

import java.util.Scanner;

public class CheckPrimeNumber {

    void checkPrimeNum(){

        System.out.print("Input a random numbers: ");
        Scanner sc = new Scanner(System.in);
        int ranNum = sc.nextInt();

        boolean itis = true;

        for(int i=2; i<=Math.sqrt(ranNum);i++){

            if(ranNum%i == 0){
                itis = false;
                System.out.printf("%d can divided for: %d.\nSo ",ranNum, i);
                break;
            }
        }
        if(itis){
            System.out.printf("This number, %d, is a prime number!", ranNum);
        } else
            System.out.printf("this number, %d, is not a prime number", ranNum);
    }
}
