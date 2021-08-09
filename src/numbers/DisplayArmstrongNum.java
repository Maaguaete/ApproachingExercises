package numbers;

import java.util.Scanner;

public class DisplayArmstrongNum {

    void displayArmstrongnum(){

        System.out.println("Input the range to display the Armstrong numbers.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Start : ");
        int startNum = sc.nextInt();
        System.out.print("End at: ");
        int endNum = sc.nextInt();
        int temp, rem;


        for(int i=startNum; i<=endNum;i++){

            int armstrongNum = 0;
            temp = i;
            int counter = 0;
            while( temp != 0){
                rem = temp%10;
                armstrongNum = armstrongNum + rem*rem*rem;
                temp/=10;
            }
            if(i == armstrongNum){
                System.out.println(i);
            }
        }
    }
}
