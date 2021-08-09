package calculate_shape;

import java.util.Scanner;

public class MainBoard {

    public static void main(String[] args){

        System.out.print("Choose the shape!\n"+
                "1. Circle.\n" +
                "2. Rectangle.\n" +
                "3. Triangle.\n" +
                "4. Square.\n" +
                "Your shape is: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();


        switch(choice){
            case 1 -> {
                Circle do1 = new Circle();
                do1.calculate();
            }
            case 2 -> {
                Rectangle do2 = new Rectangle();
                do2.calculate();
            }
            case 3 -> {
                Triangle do3 = new Triangle();
                do3.calculate();
            }
            case 4 -> {
                Square do4 = new Square();
                do4.calculate();
            }
        }

    }
}
