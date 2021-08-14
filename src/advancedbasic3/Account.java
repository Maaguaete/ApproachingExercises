package advancedbasic3;

import java.text.NumberFormat;
import java.util.Scanner;

public class Account {
    private long accNumber;
    private String accName;
    private double balance;
    Scanner sc = new Scanner(System.in);
    NumberFormat currency = NumberFormat.getCurrencyInstance();

    Account(){ }

    Account(long accNumber, String accName, double balance){
        this.accNumber = accNumber;
        this.accName = accName;
        this.balance = balance;
    }

    public double depositing(){

        System.out.print("Amount of money to add: ");
        double deposit = sc.nextDouble();
        if (deposit<0){
            System.out.println("Invalid deposit money!");

        } else {
            balance = balance + deposit;
            System.out.printf("%s's account's just received %s.\n" +
                    "%s's account balance now is: %s\n",
                    accName,currency.format(deposit),accName, currency.format(balance));
        }
        return deposit;
    }

    public double withdrawing(){

        System.out.print("Enter the amount of withdraw money: ");
        double withdrawal = sc.nextDouble();
        if(withdrawal<=balance){
            balance = balance-withdrawal;
            System.out.printf("%s's account's just been withdrawn %s.\n" +
                    "%s's account balance now is: %s\n",
                    accName,currency.format(withdrawal),accName, currency.format(balance));
        }else {
            System.out.println("Invalid withdraw money!");
        }
        return withdrawal;
    }

    void displayAllAccount(){
        System.out.printf("%-18d %-32s %-20s\n", accNumber, accName, currency.format(balance));
    }

    @Override
    public String toString() {
        return "Account: %d - Full name: %s - Balance: %,.2f VND".formatted(accNumber, accName, balance);
    }

    public long getAccNumber(){
        return accNumber;
    }
    public void setAccNumber(long accNumber){
        this.accNumber = accNumber;
    }
    public String getAccName(){
        return accName;
    }
    public void setAccName(String accName){
        this.accName = accName;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

}
