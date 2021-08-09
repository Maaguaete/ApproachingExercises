package numbers;

import java.util.Scanner;

public class DigitDetaching {

    void detachDigit(){

        System.out.print("Input a numbers: ");
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();

        // Cách 2: hàng đơn vị là nhỏ nhất
        int temp = Number;
        int length = 0;

        while (temp>0){
            temp/=10;
            length++;
        }
        System.out.println("This number has total "+length+" digits.");
        for(;Number>0; length--){

            int digit = Number%10;
            Number/=10;
            System.out.printf("Digit position %d: %d\n",length,digit);
        }


//        Cách 1: hàng đơn vị là lớn nhất
//        for(int i =1; Number>0; i++){
//            temp = Number%10;
//            Number/=10;
//            System.out.printf("Digit %d: %d\n",i,temp);
//        }


    }
}
