package numbers;

import java.util.Random;
import java.util.Scanner;

public class DisplayRandomNumber {

    void displayRandomNum(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantity of random numbers: ");
        int quantity = sc.nextInt();

        Random rannum = new Random();
        for(int i=1; i<= quantity;i++){

            System.out.print(rannum.nextInt(500)+"\t");

            if(i%10==0){
                System.out.println();
            }
        }
    }
}
