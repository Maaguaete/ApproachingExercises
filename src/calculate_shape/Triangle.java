package calculate_shape;

import java.util.Scanner;

public class Triangle {

    void calculate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input length and height of a triangle.");
        System.out.print("Length: ");
        double length = sc.nextDouble();
        System.out.print("Height: ");
        double height = sc.nextDouble();

        System.out.print("Area of this triangle is: "+ (length*height)/2);
    }
}

