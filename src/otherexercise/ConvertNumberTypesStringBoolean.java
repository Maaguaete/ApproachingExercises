package otherexercise;

import java.util.Scanner;

public class ConvertNumberTypesStringBoolean {

    void convert(){
        System.out.print("""
                1. Decimal to Octal.
                2. Octal to Decimal.
                3. Hex to Decimal.
                4. Decimal to Hex.
                5. Binary to Octal.
                6. Octal to Binary.
                7. Decimal to Binary.
                8. Binary to Decimal.
                9. String to Boolean.
                10. Boolean to String.
                Choose 1 methods above:\s""");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice){
            case 1 -> decimalToOctal();
            case 2 -> octalToDecimal();
            case 3 ->{
                hexToDecimal(); // Using Integer.parseInt().
                hexToDecimal2(); // Using chartAt() & indexOf().
            }
            case 4 -> decimalToHex();
            case 5 -> binaryToOctal();
            case 6 -> octalToBinary();
            case 7 -> decimalToBinary();
            case 8 -> binaryToDecimal();
            case 9 -> stringToBoolean();
            case 10 -> booleanToString();
        }
    }
    void decimalToOctal(){ // Using toOctalString(int) method
        Scanner sc = new Scanner(System.in);
        System.out.print("Decimal number (parseInt method): ");
        int decimal_number =  sc.nextInt();
        System.out.println("The equivalent Octal number : "+ Integer.toOctalString(decimal_number));
    }

    void octalToDecimal(){ // Manual method
        Scanner sc = new Scanner(System.in);
        System.out.print("Octal number (manual method): ");
        int octalNumber =  sc.nextInt();

        int temp, i = 0 , decimalNumber = 0;
        while(true){
            if(octalNumber == 0){
                break;
            } else {
                temp = octalNumber%10;
                decimalNumber += temp*Math.pow(8,i);
                i++;
                octalNumber/=10;
            }
        }
        System.out.print("The equivalent decimal number: "+ decimalNumber);
    }

    void hexToDecimal(){ // Using parseInt.

        Scanner sc = new Scanner(System.in);
        System.out.print("Hex number: ");
        String hex_number = sc.nextLine();
        int decimal_number = Integer.parseInt(hex_number, 16);
        System.out.println("Decimal number after converting (using parseInt() method): "+decimal_number);
    }
    void hexToDecimal2(){ // Using chartAt() & indexOf().

        Scanner sc = new Scanner(System.in);
        int decimal_number = 0;
        System.out.print("Hex number: ");
        String hex_number = sc.nextLine();

        String compareSource = "0123456789ABCDEF";
        hex_number = hex_number.toUpperCase();
        for(int i=0; i< hex_number.length();i++){

            char ch = hex_number.charAt(i);
            int tail = compareSource.indexOf(ch);
            decimal_number =16*decimal_number + tail;
        }
        System.out.println("The equivalent decimal number (using charAt() & indexOf() method): "+ decimal_number);
    }

    void decimalToHex(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Decimal number (parseInt method): ");
        int decimal_number =  sc.nextInt();
        System.out.print("The equivalent Hex number: "+Integer.toHexString(decimal_number).toUpperCase());
    }

    void binaryToOctal(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Binary number: ");
        int decimal_temp = Integer.parseInt(sc.nextLine(), 2);
        System.out.print("The equivalent Octal number: "+ Integer.toOctalString(decimal_temp));
    }

    void octalToBinary(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Octal number: ");
        int decimal_temp = Integer.parseInt(sc.nextLine(),8);
        System.out.print("The equivalent binary number: "+Integer.toBinaryString(decimal_temp));
    }

    void decimalToBinary(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Decimal number: ");
        String binaryNumber = Integer.toBinaryString(sc.nextInt());
        System.out.print("The equivalent binary number: "+binaryNumber);
    }

    void binaryToDecimal(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Binary number: ");
        int decimalNumber = Integer.parseInt(sc.nextLine(),2);
        System.out.print("The equivalent decimal number: "+ decimalNumber);
    }

    void stringToBoolean(){

        Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        String str = sc.nextLine();
        System.out.print("Output Boolean: "+ Boolean.valueOf(str));
    }

    void booleanToString(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Boolean value: ");
        String str = String.valueOf(sc.nextBoolean());
        System.out.print("Output string: "+str);
    }
}
