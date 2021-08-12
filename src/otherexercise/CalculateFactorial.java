package otherexercise;

import java.util.Scanner;

public class CalculateFactorial {

    void calculateFactorial(){

        System.out.print("N! number :");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int factorialNum = 1;
        System.out.printf("The factorial of %d (%d!=",N,N);
        for(int i=N;i>0;i--){
            factorialNum *=i;
            System.out.print(i+"*");
        }
        System.out.printf(") is: %,3d",factorialNum);
    }
}
