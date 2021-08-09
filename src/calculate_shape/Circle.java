package calculate_shape;

import java.util.Scanner;

public class Circle {

    private double Circuit(double radius){
        return Math.PI*radius*2;
    }
    private double Area(double radius){
        return Math.pow(radius, 2)*Math.PI;
    }

    void calculate() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input radius: ");
        double radius = sc.nextDouble();

        System.out.print("1. Calculate the Circumference.\n2. Calculate the Area.\n3. All of the above.\n" +
                "Display the result of : ");
        int i = sc.nextInt();
        switch (i) {
            case 1 -> System.out.println("The Circumference is: " + Circuit(radius));
            case 2 -> System.out.format("The Area is: %.3f",Area(radius));
            case 3 -> System.out.format("The Circumference is: %.3f\nThe Area is: %.3f",Circuit(radius), Area(radius));
        }

    }
}
