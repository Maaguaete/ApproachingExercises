package calculate_shape;

import java.util.Scanner;

public class Square {

    private double perimeter(double side_length){
        return side_length*4;
    }
    private double area(double side_length){
        return side_length*side_length;
    }

    void calculate() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the side length of the square: .");
        double side_length = sc.nextDouble();

        System.out.print("1. Calculate the Perimeter.\n2. Calculate the Area.\n3. All of the above.\n" +
                "Display the result of : ");
        int i = sc.nextInt();

        switch (i) {
            case 1 -> System.out.println("The Perimeter is: " + perimeter(side_length));
            case 2 -> System.out.format("The Area is: %.3f", area(side_length));
            case 3 -> System.out.format("The Perimeter is: %.3f\n" +
                    "The Area is: %.3f",perimeter(side_length), area(side_length));
        }
    }
}
