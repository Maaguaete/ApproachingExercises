package advancedbasic3;

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
            3. Depositing into your account.
            4. Withdrawing from your account.
            5. My return after Maturity date.
            6. Transfer money.
            Let's\s""");
            int choice = sc.nextInt();

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
                        System.out.println("Balance: " + acc[i].getBalance());
                    }
                }
                case 2 ->{
                    System.out.printf("%-20s %-30s %-20s\n", "Account number","Account Name","Balance");
                    for(int i=0;i<N;i++){
                        acc[i].displayAllAccount();
                    }
                }
                case 3-> {
                    System.out.print("Deposit into Account Number: ");
                    long input = sc.nextLong();
                    for (int i = 0; i < N; i++) {
                        if (input != acc[i].getAccNumber()) {
                            if(i==2){
                                System.out.println("Invalid account number!");
                                break;
                            }
                        }else {
                            acc[i].depositing();
                            break;
                        }
                    }
                }

                case 4-> {
                    System.out.print("Withdraw from Account Number: ");
                    long input = sc.nextLong();
                    for (int i = 0; i < N; i++) {
                        if (input != acc[i].getAccNumber()) {
                            if(i==2){
                                System.out.println("Invalid account number!");
                                break;
                            }
                        }else {
                            acc[i].withdrawing();
                            break;
                        }
                    }
                }

                default -> stop = false;

            }
        }while(stop);
    }
}
