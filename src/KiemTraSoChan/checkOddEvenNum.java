package KiemTraSoChan;
import java.util.Scanner;
public class checkOddEvenNum {
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        if (num%2 ==0){
            System.out.println("This num, "+num+", is an even number!");
        } else {
            System.out.println("This num, "+num+", is an odd number!");
        }
    }
}
