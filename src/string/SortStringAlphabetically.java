package string;

import java.util.Scanner;

public class SortStringAlphabetically {

    void sortString(){

        String temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers of Strings: ");
        int N = sc.nextInt();
        String[] str = new String[N+1];

        Scanner sc2 = new Scanner(System.in);
        // Khong hieu sao phai dung 2 scanner, reuse sc.nextLine() => str[1] luon = "    " //
        System.out.println("Input each string: ");
        for(int i=1; i<=N; i++)
        {
            System.out.print("String number "+i+" : ");
            str[i] = sc2.nextLine();
        }

        for(int i=1; (i<=N) && (i+1<=N) ;i++){
            if( ( str[i].compareTo(str[i+1]) ) > 0 ){
                temp = str[i+1];
                str[i+1] = str[i];
                str[i] = temp;
            }
        }
        // After sort the strings alphabetically
        for(int i=1; i<=N;i++) {
            System.out.println(str[i]);
        }

    }
}
