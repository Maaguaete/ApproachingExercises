package numbers;

import java.util.Scanner;

public class PrimeNumInGivenRange {

    void displayPrimeNumInRange(){

        System.out.print("Input the range of the prime numbers from 1 to: ");
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int primeNum = 3;
        boolean itis = true;
        int block_10 = 1;

        System.out.printf("The prime numbers from 1 to %d is: \n2\t", range);
        for(int i = 2;i<range;i++){

            for(int j = 2; j<= Math.sqrt(primeNum);j++) {

                if(primeNum % j == 0){
                    itis = false;
                }
            }

            if(itis){
                System.out.print(primeNum+"\t");
                block_10++;
                if(block_10 ==10){
                    System.out.println();
                    block_10 =0;
                }
            }

            primeNum++;
            itis = true;
        }
    }
}
