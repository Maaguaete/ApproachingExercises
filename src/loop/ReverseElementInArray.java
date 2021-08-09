package loop;

import java.util.Scanner;

public class ReverseElementInArray {

    void reverseElement(){

        System.out.print("Input numbers of elements in an array: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            System.out.print("Input element "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("The array after reversed is: ");

        for (int i = N-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
