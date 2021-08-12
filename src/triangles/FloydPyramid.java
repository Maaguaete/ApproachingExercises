package triangles;

import java.util.Scanner;

public class FloydPyramid {

    void display(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Height of pyramid: ");
        int h = sc.nextInt();
        int k=1;
        for(int i=1; i<=h; i++){
            for(int j=1; j<=i; j++, k++){
                System.out.print(k+"\t");
            }
            System.out.println();
        }
    }
}
