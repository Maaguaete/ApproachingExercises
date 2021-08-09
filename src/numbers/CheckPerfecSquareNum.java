package numbers;

import java.util.Scanner;

public class CheckPerfecSquareNum {

    void checkPerfectSquare(){

        System.out.print("Input a random numbers: ");
        Scanner sc = new Scanner(System.in);
        int ranNum = sc.nextInt();
        double sqrtNum = Math.sqrt(ranNum);

        if(sqrtNum-Math.floor(sqrtNum) == 0){
            System.out.printf("This number, %d, is a perfect square number.",ranNum);
        } else
            System.out.printf("This number, %d, is not a perfect square number.", ranNum);

    }
}
