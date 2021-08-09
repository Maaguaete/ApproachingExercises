package loop;

import java.util.Scanner;

public class AverageCalculation {
    void averageCalculation(){

        double sum=0;
        System.out.print("Number quantity: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1; i<=N; i++){
            System.out.print("Input the value of no. "+i+": ");
            double a = sc.nextDouble();
            sum=sum+a;
        }
        System.out.format("The average = %.2f", sum/N);
    }
}
