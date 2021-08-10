package sum2javanumber;
import java.util.Scanner;
public class Sum2NumberScanner {
    static public void main(String[] args){
        System.out.print("Input a: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        System.out.print("Input b: ");
        int b = sc.nextInt();
        sc.nextLine();
        int sum = a+b;
        System.out.println("Tong a + b = "+sum);
    }
}
