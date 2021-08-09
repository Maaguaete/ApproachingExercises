package numbers;

import java.util.Scanner;

public class MinByConditionalOperator {

    void findMinByCO(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = sc.nextInt();
        System.out.print("Input b: ");
        int b = sc.nextInt();
        System.out.print("Input c: ");
        int c = sc.nextInt();

        int temp = a<b ? a:b;
        int Min = c<temp ? c:temp;

        System.out.print("Minimum is: "+Min);
    }
}
