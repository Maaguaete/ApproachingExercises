package triangles;

import java.util.Scanner;

public class DisplayMain {

    public static void main(String[] args){

        System.out.print("""
                Display:\s
                1. Rectangular triangle.
                2. Upside-down Rectangular Triangle.
                3. Pyramid.
                4. Pascal Pyramid.
                5. Floyd Pyramid.
                Enter your number here:\s""");
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();

        switch (line){
            case 1-> {
                RectangularTriangle do1 = new RectangularTriangle();
                do1.display();
            }
            case 2-> {
                USDRectangularTriangle do2 = new USDRectangularTriangle();
                do2.display();
            }
            case 3-> {
                Pyramid do3 = new Pyramid();
                do3.display();
            }
            case 4-> {
                NumericPyramid do4 = new NumericPyramid();
                do4.display();
            }
            case 5-> {
                FloydPyramid do5 = new FloydPyramid();
                do5.display();
            }
        }
    }
}
