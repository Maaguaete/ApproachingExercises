package leapyear;
import java.util.Scanner;
public class LeapYear {
        public static void main(String[] args){
            System.out.println("Year :");
            Scanner sc = new Scanner(System.in);
            int year = sc.nextInt();
            if(year % 4 == 0){
                if (year %100 !=0){
                    System.out.println("This year, "+year+" is a leap year!");
                }else if (year%400 == 0){
                    System.out.println("This year, "+year+" is a leap year!");

                } else if (year %100 ==0){
                    System.out.println("This year, "+year+" is NOT a leap year!");
                }
            }

         }
}
