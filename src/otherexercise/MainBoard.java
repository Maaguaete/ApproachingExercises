package otherexercise;

import java.util.Scanner;

public class MainBoard {
    public static void main(String[] args){

        System.out.print("""
                Some exercises!
                1. Adding 2 arrays.
                2. Transforming an ArrayList to an Array.
                3. Transposing a Matrix number.
                4. Displaying current time.
                5. Converting the time between second, minute and hour formats.
                6. Converting between types: Hex, Octal, Decimal, Binary, String, Boolean, Char and Int.
                7. Displaying ASCII code of a character.
                8. Displaying a Fibonacci string.
                9. Calculating the factorial of N number.
                10. Calculating a linear equation's solution.
                11. Calculating a quadratic equation's solutions.
                Run line number:\s""");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch(choice) {
            case 1 -> {
                Add2Arrays do1 = new Add2Arrays();
                do1.manually();
                do1.arraycopy();
            }
            case 2 -> {
                Transform_ArrayListToArray do2 = new Transform_ArrayListToArray();
                do2.transform();
            }
            case 3 -> {
                TransposeMatrix do3 = new TransposeMatrix();
                do3.transpose();
            }
            case 4 -> {
                DisplayCurrentTime do4 = new DisplayCurrentTime();
                do4.displayCurrentTime();
            }
            case 5 -> {
                ConvertTimeFormat do5 = new ConvertTimeFormat();
                do5.convertTime();
            }
            case 6 -> {
                ConvertNumberTypesStringBoolean do6 = new ConvertNumberTypesStringBoolean();
                do6.convert();
            }
            case 7 ->{
                ASCIIValueOfChar do7 = new ASCIIValueOfChar();
                do7.displayASCII();
            }
            case 8 ->{
                FibonacciString do8 = new FibonacciString();
                do8.displayFibonacciString();
            }
            case 9 ->{
                CalculateFactorial do9 = new CalculateFactorial();
                do9.calculateFactorial();
            }
            case 10 ->{
                LinearEquation do10 = new LinearEquation();
                do10.findRoot();
            }
            case 11 ->{
                QuadraticEquation do11 = new QuadraticEquation();
                do11.findRoot();
            }
        }
    }
}
