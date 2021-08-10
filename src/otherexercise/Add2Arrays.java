package otherexercise;

import java.util.Arrays;

public class Add2Arrays {

    int[] arr_1 = {1,2,3};
    int[] arr_2 = {4,5,6};
    int[] combine_arr;

    void manually(){

        int length = arr_1.length + arr_2.length;
        combine_arr = new int[length];

        int i=0;
        for(int cell: arr_1){
            combine_arr[i]= cell;
            i++;
        }
        for (int cell: arr_2){
            combine_arr[i] = cell;
            i++;
        }
        System.out.println("The combination of 2 arrays is - using Arrays.toString(): ");
        System.out.println(Arrays.toString(combine_arr));
    }

    void arraycopy(){

        System.arraycopy(arr_1, 0,combine_arr,0,arr_1.length);
        System.arraycopy(arr_2,0,combine_arr,arr_1.length,arr_2.length);

        System.out.println("The combination of 2 arrays is - using for() to print each element: ");
        for(int i=0; i< (arr_1.length+arr_2.length);i++){
            System.out.print(combine_arr[i]+"\t");
        }
    }
}
