package otherexercise;

import java.util.Scanner;

public class QuadraticEquation {

    void findRoot(){

        Scanner sc = new Scanner(System.in);
        double a, b, c, x1, x2, delta;
        System.out.println("Quadratic equation: aX^2 + bX + c = 0 with: ");
        do{
            System.out.print("a (a # 0): ");
            a = sc.nextDouble();
        } while(a==0);
        System.out.print("b: ");
        b = sc.nextDouble();
        System.out.print("c: ");
        c = sc.nextDouble();

        delta = Math.pow(b,2)-4*a*c;
        if(delta < 0){
            System.out.print("This quadratic equation has NONE of solution!");
        } else if(delta == 0){
            System.out.printf("This quadratic equation has 1 unique solution X1 = X2 = %.2f",-b/(2*a));
        } else {
            x1 = (-b+Math.sqrt(delta))/(2*a);
            x2 = (-b-Math.sqrt(delta))/(2*a);
            System.out.printf("""
                    This quadratic equation has 2 real solutions!
                    X1 = %.2f.
                    X2 = %.2f.""",x1,x2);
        }
    }
}
