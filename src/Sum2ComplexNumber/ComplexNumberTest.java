package Sum2ComplexNumber;
import java.util.Scanner;
/**
 * Sum of 2 INPUTED complex numbers
 */
public class ComplexNumberTest{
    public static void main(String[] args) {
        double real;
        double image;
        double sumreal=0;
        double sumimage=0;
        //
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the quantity of numbers to sum: ");
        int randomNumber = sc.nextInt();
        //
        if(randomNumber <=1){
            System.out.println("Pls input enough at least 2 complex numbers for summing!!!");
            return;
        }

        for (int i = 1; i <= randomNumber; i++) {

            System.out.print("Enter the REAL part of the complex number " + i + ": ");
            real = sc.nextDouble();
            //
            System.out.print("Enter the IMAGE part of the complex number " + i + ": ");
            image = sc.nextDouble();
            //
            sumreal = sumreal + real;
            sumimage = sumimage + image;
        }
        System.out.println("Sum of "+randomNumber+" complex numbers: Z= "+sumreal+" + "+sumimage+"i.");

    }
}
