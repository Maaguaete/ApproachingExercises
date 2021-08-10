package compoundinterest;

import java.lang.Math;
import java.util.Scanner;

public class CompoundInterest {

    public static void main(String[] args) {

        int n, t;
        double P, R, comInterest;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Principal: ");
        P = sc.nextDouble();
        System.out.print("Enter your rate Interest (per year): ");
        R = sc.nextDouble();
        System.out.print("Enter compound frequency (times per year): ");
        n = sc.nextInt();
        System.out.print("Enter time span (in years): ");
        t = sc.nextInt();
        comInterest = P*Math.pow((1 + R / n), (n * t)) - P;
        System.out.println("Amount of compound interest: "+comInterest+
                "\nTotal in return: "+(P+comInterest));
    }

}
