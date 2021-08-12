package otherexercise;

import java.util.Scanner;

public class FibonacciString {

    void displayFibonacciString(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Numbers of a Fibonacci string to display: ");
        int numbers = sc.nextInt();
        int num1=0, num2=1;
        for(int i=0; i<numbers;i++){

            System.out.print(num1+" ");
            int sum2pre = num1+num2;
            num1 = num2;
            num2 = sum2pre;
        }
    }
}
