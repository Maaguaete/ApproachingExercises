package numbers;

import java.util.Scanner;

public class SwapNumbers {

    void swapttemp(){ // Cách này Dùng biến đệm

        Scanner sc= new Scanner(System.in);
        System.out.println("Swapping by a temporary number: ");
        System.out.print("Input a: ");
        int a = sc.nextInt();
        System.out.print("Input b: ");
        int b = sc.nextInt();

        int temp;
        System.out.println("Before swapping. Number a: "+a+", number b: "+b);
        temp = a;
        a=b;
        b = temp;
        System.out.println("After swapping. Number a: "+a+", number b: "+b);
    }
    void swapcalculation() { // Cách này Dùng tính trừ

        Scanner sc = new Scanner(System.in);
        System.out.println("Swapping by calculation: ");
        System.out.print("Input a: ");
        int a = sc.nextInt();
        System.out.print("Input b: ");
        int b = sc.nextInt();

        System.out.println("Before swapping. Number a: " + a + ", number b: " + b);
        a = a - b;
        b = a + b;
        a = b - a;
        System.out.println("After swapping. Number a: " + a + ", number b: " + b);
    }
}
