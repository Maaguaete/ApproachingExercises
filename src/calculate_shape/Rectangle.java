package calculate_shape;

import java.util.Scanner;

public class Rectangle {

    private double perimeter(double length, double width){
        return 2*(length+width);
    }
    private double area(double length, double width){
        return length*width;
    }

    void calculate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input length and width of a rectangle.");
        System.out.print("Length: ");
        double length = sc.nextDouble();
        System.out.print("Width: ");
        double width = sc.nextDouble();

        System.out.print("1. Calculate the Perimeter.\n2. Calculate the Area.\n3.All of the above.\n" +
                "Display the result of : ");
        int i = sc.nextInt();

        switch (i) {
            case 1 -> System.out.format("The Perimeter is: %.3f", perimeter(length, width));
            case 2 -> System.out.format("The Area is: %.3f", area(length, width));
            case 3 -> System.out.format("The Perimeter is: %.3f\n" + "The Area is: %.3f\n",
                                            perimeter(length, width), area(length,width));
        }
    }

}
