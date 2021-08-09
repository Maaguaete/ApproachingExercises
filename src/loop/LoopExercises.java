package loop;

import java.util.Scanner;

public class LoopExercises {
    public static void main(String[] args) {

        System.out.print("Type the number below for the method being executed: \n" +
                "1. Calculate the average of numbers.\n" +
                "2. Reverse the elements in an array.\n" +
                "3. Arrange the array increasingly.\n" +
                "4. Sum 2 Matrices.\n" +
                "*. ");

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("");

        switch (i) {
            case 1:
                AverageCalculation doing1 = new AverageCalculation();
                doing1.averageCalculation();
                break;
            case 2:
                ReverseElementInArray doing2 = new ReverseElementInArray();
                doing2.reverseElement();
                break;
            case 3:
                IncreasingArray doing3 = new IncreasingArray();
                doing3.increasingArray();
                break;
            case 4:
                Sum2Matrices doing4 = new Sum2Matrices();
                doing4.sum2matrix();
                break;
        }
    }

}
