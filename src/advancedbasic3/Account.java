package advancedbasic3;

import java.text.NumberFormat;
import java.util.Scanner;

public class Account {
    private long accNumber;
    private String accName;
    private double balance;
    private double interestRate = 0.035;

    Scanner sc = new Scanner(System.in);
    NumberFormat currency = NumberFormat.getCurrencyInstance();

    Account(){ }

    Account(long accNumber, String accName, double balance){
        this.accNumber = accNumber;
        this.accName = accName;
        this.balance = balance;
    }

    public void displayBalance(){
        System.out.printf("%s's account balance now is: %s.\n",getAccName(),currency.format(balance));
    }
    public void mature(){
        double interestPayment;
        interestPayment = balance*interestRate;
        balance = balance + interestPayment;
        System.out.printf("%s's account's just received %s of interest payment from 1 month maturity bond.\n",
                accName,currency.format(interestPayment));
    }

    public double depositing(){

        System.out.print("Amount of money to add: ");
        double deposit = sc.nextDouble();
        if (deposit<=0){
            System.out.println("Invalid deposit money!");

        } else {
            balance = balance + deposit;
            System.out.printf("%s's account's just received %s.\n",accName,currency.format(deposit));
        }
        return deposit;
    }

    public void withdrawing(){

        System.out.print("Enter the amount of withdraw money: ");
        double withdrawal = sc.nextDouble();
        if(withdrawal<=balance && withdrawal>0){
            balance = balance-withdrawal;
            System.out.printf("%s's just withdrawn %s.\n",accName,currency.format(withdrawal));
        }else {
            System.out.println("Invalid withdraw money!");
        }
    }

    void displayAllAccount(){
        System.out.printf("%-18d %-25s %-20s\n", accNumber, accName, currency.format(balance));
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
