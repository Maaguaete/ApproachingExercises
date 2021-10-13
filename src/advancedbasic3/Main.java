package advancedbasic3;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        boolean stop = true;

        System.out.print("Input numbers of the opening ACB-bank accounts: ");
        int N = sc.nextInt();
        Account[] acc = new Account[N];
        do{
            System.out.print("""
            
            Are you going to ...
            1. Opening accounts.
            2. Displaying account's information.
            3. Depositing into an account.
            4. Withdrawing from an account.
            5. Maturity.
            6. Transfer money.
            7. Exit.
            Your move:\s""");
            int choice = sc.nextInt();
            System.out.println();

            switch (choice) {
                case 1-> {
                    for (int i = 0; i < N; i++) {
                        acc[i] = new Account();
                        System.out.print("Input account number: ");
                        acc[i].setAccNumber(sc.nextLong());
                        sc.nextLine();
                        System.out.print("Input account name: ");
                        acc[i].setAccName(sc.nextLine());
                        acc[i].setBalance(50);
                        acc[i].displayBalance();
                    }
                }
                case 2 ->{
                    System.out.printf("%-20s %-25s %-15s\n", "Account number","Account Name","Balance");
                    for(int i=0;i<N;i++){
                        acc[i].displayAllAccount();
                    }
                }
                case 3-> {
                    System.out.print("Deposit into Account Number: ");
                    long input = sc.nextLong();
                    for (int i = 0; i < N; i++) {
                        if (input != acc[i].getAccNumber()) {
                            if(i==N-1){
                                System.out.println("Invalid account number!");
                                break;
                            }
                        }else {
                            acc[i].depositing();
                            acc[i].displayBalance();
                            break;
                        }
                    }
                }
                case 4-> {
                    System.out.print("Withdraw from Account Number: ");
                    long input = sc.nextLong();
                    for (int i = 0; i < N; i++) {
                        if(input == acc[i].getAccNumber()){
                            acc[i].withdrawing();
                            acc[i].displayBalance();
                            break;
                        }
                        else if(i==N-1 && input!= acc[i].getAccNumber()){
                            System.out.println("Invalid account number!");
                        }
                    }
                }
                case 5->{
                    System.out.print("Account Number on Maturity Date: ");
                    long input = sc.nextLong();
                    for(int i=0; i<N;i++){
                        if(input == acc[i].getAccNumber()){
                            acc[i].mature();
                            acc[i].displayBalance();
                            break;
                        }
                        else if(i==N-1){
                            System.out.println("Invalid account number!");
                        }
                    }
                }
                case 6->{
                    System.out.print("Transfer...\nFrom Account Number: ");
                    long accFrom = sc.nextLong();

                    for(int i=0; i<N;i++){
                        int j;
                        if(accFrom == acc[i].getAccNumber()){

                            double balanceFrom = acc[i].getBalance();
                            System.out.print("To Account Number: ");
                            long accTo = sc.nextLong();

                            for(j=0;j<N;j++){

                                if(accTo == acc[j].getAccNumber()){
                                    double balanceTo = acc[j].getBalance();
                                    System.out.print("Amount of transferred money: ");
                                    double money = sc.nextDouble();

                                    if( money <= balanceFrom){
                                        if(money<0){
                                            System.out.println("Invalid value! Don't steal bro!");
                                            break;
                                        }
                                        balanceFrom -= money;
                                        balanceTo+=money;
                                        acc[i].setBalance(balanceFrom);
                                        acc[j].setBalance(balanceTo);
                                        System.out.printf("""
                                                        Transaction completed!
                                                        %s has transferred %s to %s's account.
                                                        """,acc[i].getAccName(),
                                                NumberFormat.getCurrencyInstance().format(money),acc[j].getAccName());
                                        acc[i].displayBalance();
                                        acc[j].displayBalance();
                                    } else {
                                        System.out.println("Out of balance!");
                                        acc[i].displayBalance();
                                        break;
                                    }
                                    break;
                                }else if(j==N-1 && accTo != acc[j].getAccNumber()) {
                                    System.out.println("Invalid receiving account number!");
                                    break;
                                }
                            }
                            break;

                        } else if( i==N-1 && accFrom != acc[i].getAccNumber()){
                            System.out.println("Invalid transferring account number!");
                        }
                    }
                }
                case 7->{
                    System.out.println("Shutting down ...");
                    stop = false;
                }

                default ->
                    System.out.println("Move correctly!");
            }
        }while(stop);
    }
}
