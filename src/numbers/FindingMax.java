package numbers;

import java.util.Scanner;

public class FindingMax {
    
    void findMax(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Numbers in the list to compare: ");
        int quantity = sc.nextInt();
        int[] numbers = new int[quantity];
        
        for(int i =0;i<quantity;i++){
            System.out.printf("Input value %d: ",i+1);
            numbers[i] = sc.nextInt();
        }
        int max = numbers[0];
        for(int i=1; i<quantity;i++){

            if(numbers[i]>numbers[i-1]){
                max = numbers[i];
            }
        }
        System.out.print("The maximum number is: "+max);
    }
}
