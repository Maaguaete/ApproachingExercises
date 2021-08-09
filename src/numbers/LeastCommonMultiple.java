package numbers;

import java.util.Scanner;

public class LeastCommonMultiple {

    void leastCommonMultiple1(){ // using while loop.

        Scanner sc = new Scanner(System.in);
        System.out.println("Input 2 integer numbers A ,B :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int lcm = a; // least common multiple.

        if(a<b){
            lcm = b;
        }
        System.out.print("The Least Common Multiple of A and B is: ");
        while(true){
            if(lcm%a ==0 && lcm%b == 0){
                System.out.println(lcm);
                break;
            }
            lcm++;
        }
    }

    void leastCommonMultiple2() { // using Greatest Common Divisor. LCM = (A*B)/GCD.

        Scanner sc = new Scanner(System.in);
        System.out.println("Input 2 integer numbers A ,B :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = 1;
        // Fing Greatest Common Divisor (GCM).
        for(int i =1; i<=a && i<=b; i++){

            if(a%i==0 && b%i==0){
                gcd = i ;
            }
        }
        System.out.println("The Least Common Multiple is: "+(a*b)/gcd);
    }

}
