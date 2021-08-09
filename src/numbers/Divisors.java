package numbers;

import java.util.Scanner;

public class Divisors {

    void takeDivisors(){

        System.out.print("Input an integer number: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.print("All the divisors of "+N+" is: ");
        for(int i=1; i<=N;i++){
            if(N%i == 0){
                System.out.print(i+" ");
            }
        }
    }
}
