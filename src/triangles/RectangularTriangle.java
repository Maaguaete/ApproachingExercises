package triangles;

import java.util.Scanner;

public class RectangularTriangle {

    void display(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Input the height of the Triangle: ");
        int height = sc.nextInt();

        for(int i = 1; i <= height ; i++){
            for(int j=1; j<=i;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
