package triangles;

import java.util.Scanner;

public class USDRectangularTriangle {

    void display(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Input the height of the Triangle: ");
        int height = sc.nextInt();

        for(int i=height; i>0; i--){
            for(int j=1;j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
