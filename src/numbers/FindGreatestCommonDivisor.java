package numbers;

import java.util.Scanner;

public class FindGreatestCommonDivisor {

    void findGCD(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = sc.nextInt();
        System.out.print("Input b: ");
        int b = sc.nextInt();

        while(a!=b){
            if(a>b){
                a=a-b;
            } else
                b=b-a;
        }
        System.out.printf("The Greatest Common Divisor is: %d", a, b, a);
    }
}
