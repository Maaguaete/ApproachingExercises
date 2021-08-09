package numbers;

import java.util.Scanner;

public class DisplayPrimeNumber {
    void displayPrimeNumber(){

        System.out.print("Input how many prime numbers to be printed: ");
        Scanner sc = new Scanner(System.in);
        int primeNo_Quantity = sc.nextInt();
        int num = 3;
        boolean itis = true;

        System.out.print("The prime number list: \n" + "2 \t");
        for(int i=2; i<= primeNo_Quantity; ){

            for(int j =2; j<=Math.sqrt(num); j++){

                if(num%j == 0){
                    itis = false;
                }
            }
            if(itis)
            {
                System.out.print(num+"\t");

                if(i%10==0 ){
                    System.out.println();
                }
                i++;
            }
            num++;
            itis = true;
        }

    }
}
