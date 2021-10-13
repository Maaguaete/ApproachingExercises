package loop;

import java.util.Scanner;

public class IncreasingArray {

    void increasingArray(){

        System.out.print("Input the array's length: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        System.out.println("Input the value of array!");
        for(int i=0;i<N;i++){

            System.out.print("The value no. "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i< N-1; i++) {
            for(int k=i+1; k<N ; k++) {
                if(arr[i]>arr[k]) {
                    int temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }
        }
//        Cach nay cua toi: Khong hieu sao nhung van dung nhe
//        for(int i=0;i<N;i++){
//            for(int j=0;j<N;j++){
//
//                if(arr[i]<arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }

        for(int i =0;i<N;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
