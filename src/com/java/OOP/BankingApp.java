package com.java.OOP;

import java.util.Objects;
import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Account acc=null;
        while (true) {
            int options = getOption();
            switch (options){
                case 1:
                    System.out.print("Please select the type of account from the following options: " + "\n" + "1: Savings Account" + "\n" + "2: Checkings Account");
                    System.out.print("\nenter the option: ");
                    Scanner scanner = new Scanner(System.in);
                    int option = scanner.nextInt();
                    scanner.nextLine();
                    switch (option) {
                        case 1:
                            if(Objects.isNull(acc)) {
                                System.out.print("Please enter your name: ");
                                String name = scanner.nextLine();
                                System.out.print("Please enter the account number: ");
                                long accNum = scanner.nextLong();
                                scanner.nextLine();
                                System.out.print("How much would you like to deposit: ");
                                float amt = scanner.nextFloat();
                                acc = new SavingsAccount(accNum, name, amt);
                                System.out.println("Account Holder Name: "+acc.getName()+"  "+"Account Type: "+acc.getClass().getSimpleName()+"  "+"Account Balance: "+acc.getAmount()+"\n");
                            }else{
                                System.out.println("ACCOUNT ALREADY EXISTS!!!");
                            }
                            break;
                        case 2:
                            if(Objects.isNull(acc)) {
                                System.out.print("Please enter your name: ");
                                String currentName = scanner.nextLine();
                                System.out.print("Please enter the account number: ");
                                long currentAccNum = scanner.nextLong();
                                scanner.nextLine();
                                System.out.print("How much would you like to deposit: ");
                                float initialAmt = scanner.nextFloat();
                                acc = new CurrentAccount(currentAccNum, currentName, initialAmt);
                                System.out.println("Account Holder Name: "+acc.getName()+"  "+"Account Type: "+acc.getClass().getSimpleName()+"  "+"Account Balance: "+acc.getAmount()+"\n");
                            }else{
                                System.out.println("ACCOUNT ALREADY EXISTS!!!");
                            }
                            break;
                        default:
                            System.out.print("ACCOUNT ALREADY EXISTS!!!");
                    }
                    break;
                case 2:
                    if(!(Objects.isNull(acc))) {
                        System.out.print("enter amount to deposit: ");
                        Scanner scanner1 = new Scanner(System.in);
                        float depositAmt = scanner1.nextFloat();
                        acc.deposit(depositAmt);
                        System.out.println("Amount " + depositAmt + " has been credited " + "|| Current Balance is " + acc.getAmount());

                    }else {
                        System.out.println("Account doesn't exist please create an account!!!");
                    }
                    break;
                case 3:
                    if(acc != null){
                        System.out.print("enter amount to withdraw: ");
                        Scanner scanner2 = new Scanner(System.in);
                        float withDrawAmt = scanner2.nextFloat();
                        acc.withDraw(withDrawAmt);
                        System.out.println("Amount " + withDrawAmt + " has been credited " + "|| Current Balance is " + acc.getAmount());
                    }else {

                        System.out.println("Account doesn't exist please create an account!!!");
                    }
                    break;
                case 4:
                    if(acc != null){
                        System.out.println("Name: "+acc.getName()+"| "+" acc number: "+acc.getAccountNumber()+"| "+"Current balance: "+acc.getAmount());
                    }else {

                        System.out.println("Account doesn't exist please create an account!!!");
                    }
                    break;
                case 5:
                    System.out.println("Application Developed by Shravan Reddy Kandakatla :) !!!");
                    System.exit(0);
                    break;
                default:
                    System.out.print("Invalid Option !!!!\n");
            }




        }
    }

    private static int getOption() {
        System.out.print("1. Create Account"+"\n"+"2. Deposit"+"\n"+"3. Withdraw"+"\n"+"4. Balance"+"\n"+"5. Exit"+"\n");
        Scanner scanner= new Scanner(System.in);
        System.out.print("enter a option: ");
        return scanner.nextInt();
    }
}
