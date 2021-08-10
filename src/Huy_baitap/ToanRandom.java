package Huy_baitap;

import java.util.Random;
import java.util.Scanner;

public class ToanRandom {
    public static void main(String[] args){

        for(int i=1;i<=100;i++){
            Random ToanRandom = new Random();
            int ranNumber = ToanRandom.nextInt(5);
            System.out.print(ranNumber+"\t");
            if(i%10 ==0){
                System.out.println();
            }
        }
    }
}
