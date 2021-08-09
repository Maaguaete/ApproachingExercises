package numbers;

import java.util.Scanner;

public class PerfectNumber { // A perfect number is a number have the SUM of its divisor equals to itself.

    void checkPerfectNum(){

        System.out.print("Input a numbers: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sumdivisor = 0;

        for(int i=1;i<N;i++){
            if(N%i==0){
                sumdivisor+=i;
            }
        }
        if(sumdivisor == N){
            System.out.println("This number, "+N+", is a perfect number!");
        } else
            System.out.println("This number, "+N+", is not a perfect number!");

    }
}
