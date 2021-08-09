package triangles;

import java.util.Scanner;

public class NumericPyramid {

    void display(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Input the height of the Triangle: ");
        int height = sc.nextInt();

        for(int i=1; i<=height;i++){

            for( int j= height-i; j>0;j--){
                System.out.print("\t");
            }
            for(int k=1;k<i;k++) {
                System.out.printf("%d\t",k);
            }
            for(int k=i;k>0;k--) {
                System.out.printf("%d\t",k);
            }
            System.out.println();
        }
    }
}
