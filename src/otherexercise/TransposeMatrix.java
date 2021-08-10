package otherexercise;

import java.util.Scanner;

public class TransposeMatrix {

    void transpose(){
        int rows=2, columns=3;
        int[][] Matrix = new int[rows][columns];
        System.out.println("Input value for the matrix 2x3: ");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<rows;i++){
            for(int j=0; j<columns;j++){
                System.out.print("Value "+i+j+": ");
                Matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The origin Matrix is: ");
        for(int i=0; i<rows;i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(Matrix[i][j]+"\t");
            }
            System.out.println();
        }
        int[][] transposeMatrix = new int[columns][rows];
        for(int i=0;i<rows;i++){
            for(int j=0; j<columns; j++){
                transposeMatrix[j][i] = Matrix[i][j];
            }
        }

        System.out.println("Transposed Matrix is: ");
        for(int j=0; j<columns;j++){
            for(int i=0; i<rows;i++){
                System.out.print(transposeMatrix[j][i]+"\t");
            }
            System.out.println();
        }

    }
}