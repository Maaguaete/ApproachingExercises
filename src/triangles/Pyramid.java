package triangles;

import java.util.Scanner;

public class Pyramid {

    void display(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Input the height of the Pyramid: ");
        int height = sc.nextInt();

        for(int i=1; i<= height; i++){
            int k = 0;
            for(int j=1; j <= height - i ;j++){
                System.out.print("   ");
            }
            while(k != 2*i-1){
                System.out.print(" * ");
                k++;
            }
            System.out.println();
        }
    }
}
