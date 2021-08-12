package otherexercise;

import java.util.Scanner;

public class LinearEquation {

    void findRoot(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Linear equation: ax + b = 0 with: \na: ");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double b = sc.nextDouble();

        if(a == 0){
            if(b == 0){
                System.out.print("This equation infinitely has many solutions!");
            } else
                System.out.print("This equation has NONE of solution!");
        } else if(a != 0){
            double x = -b/a;
            System.out.printf("The equation, \"ax + b = 0\", has one solution x = %.2f",x);
        }
    }
}
