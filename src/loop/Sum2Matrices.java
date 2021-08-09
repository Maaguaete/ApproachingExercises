package loop;

import java.util.Scanner;

public class Sum2Matrices {

    void sum2matrix(){

        int rows = 2, columns = 4;
        int [][] mxA = { {1, 2, 3, -2}, {2, 3, -2, 0} };
        int [][] mxB = { {0,-1, 2, 0}, {-1, 0, 2, -3} };
        int[][] sumAB = new int[rows][columns];

        for(int i=0;i<rows;i++){

            for(int j=0; j<columns; j++){

                sumAB[i][j] = mxA[i][j] + mxB[i][j];
            }
        }

        for(int i=0; i<rows;i++){
            for(int j=0; j<columns;j++){

                System.out.print(sumAB[i][j]+"  ");
            }
            System.out.println();
        }

    }
}
