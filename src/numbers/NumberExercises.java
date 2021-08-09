package numbers;

import java.net.UnknownHostException;
import java.util.Scanner;

public class NumberExercises {
    public static void main(String[] args) throws UnknownHostException {

        System.out.print("Type the number below for the method being executed: \n" +
                "1. Swapping the values of 2 numbers.\n" +
                "2. Finding the least common multiple.\n" +
                "3. Reversing a integer number.\n" +
                "4. Checking the Symmetrical Number.\n" +
                "5. Checking the Perfect Number.\n" +
                "6. Printing all the divisors of an integer.\n" +
                "7. Displaying some prime numbers.\n" +
                "8. Displaying some prime numbers within a given range.\n" +
                "9. Detaching all digits of a number.\n" +
                "10. Checking a number whether is a prime number.\n" +
                "11. Checking a number whether is a perfect square number.\n" +
                "12. Displaying Armstrong numbers.\n" +
                "13. Displaying Random numbers.\n" +
                "14. Finding the Greatest Common Divisor by subtraction method.\n" +
                "15. Finding the maximum number.\n" +
                "16. Getting IP Address.\n"+
                "17. Finding Minimum by Conditional Operator.\n"+
                "* Enter your magic line No: ");

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        switch (i) {
            case 1 -> {
                SwapNumbers doing1 = new SwapNumbers();
                doing1.swapttemp();
                doing1.swapcalculation();
            }
            case 2 -> {
                LeastCommonMultiple doing2 = new LeastCommonMultiple();
                doing2.leastCommonMultiple1(); // using while loop
                doing2.leastCommonMultiple2(); // using Greatest Common Divisor
            }
            case 3 -> {
                ReverseNumber doing3 = new ReverseNumber();
                doing3.reverseNum();
            }
            case 4 -> {
                SymmetricalNumber doing4 = new SymmetricalNumber();
                doing4.symmetricalNumber();
            }
            case 5 -> {
                PerfectNumber doing5 = new PerfectNumber();
                doing5.checkPerfectNum();
            }
            case 6 -> {
                Divisors doing6 = new Divisors();
                doing6.takeDivisors();
            }
            case 7 -> {
                DisplayPrimeNumber doing7 = new DisplayPrimeNumber();
                doing7.displayPrimeNumber();
            }
            case 8 -> {
                PrimeNumInGivenRange doing8 = new PrimeNumInGivenRange();
                doing8.displayPrimeNumInRange();
            }
            case 9 -> {
                DigitDetaching doing9 = new DigitDetaching();
                doing9.detachDigit();
            }
            case 10 -> {
                CheckPrimeNumber doing10 = new CheckPrimeNumber();
                doing10.checkPrimeNum();
            }
            case 11 -> {
                CheckPerfecSquareNum doing11 = new CheckPerfecSquareNum();
                doing11.checkPerfectSquare();
            }
            case 12 -> {
                DisplayArmstrongNum doing12 = new DisplayArmstrongNum();
                doing12.displayArmstrongnum();
            }
            case 13 -> {
                DisplayRandomNumber doing13 = new DisplayRandomNumber();
                doing13.displayRandomNum();
            }
            case 14 -> {
                FindGreatestCommonDivisor doing14 = new FindGreatestCommonDivisor();
                doing14.findGCD();
            }
            case 15 -> {
                FindingMax doing15 = new FindingMax();
                doing15.findMax();
            }
            case 16 -> {
                GetInputIPAddress doing16 = new GetInputIPAddress();
                doing16.getIPAddress();
            }
            case 17 -> {
                MinByConditionalOperator doing17 = new MinByConditionalOperator();
                doing17.findMinByCO();
            }
        }
    }
}
