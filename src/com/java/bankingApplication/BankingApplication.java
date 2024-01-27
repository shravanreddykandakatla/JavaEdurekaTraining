package com.java.bankingApplication;

import java.util.Scanner;

public class BankingApplication {

    public static void main(String[] args){
        Account account=null;

        while(true) {
            int option = getOption();
            switch (option) {
                case 1:
                    if (account == null) {
                        Scanner scanner = new Scanner(System.in);
                        System.out.print("enter a/c number: ");
                        int accNum = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("enter name: ");
                        String name = scanner.nextLine();
                        System.out.print("enter initial deposit: ");
                        float deposit = scanner.nextFloat();
                        account = new Account(name, accNum, deposit);

                        System.out.print("Account has been successfully created for: " + account.name + " |account number: " + account.accNum + " |account balance: " + account.bal+"\n");
                    } else {
                        System.out.println("Account already exit !!!");
                    }
                    break;
                case 2:
                    if (account != null) {
                        System.out.print("enter amount to deposit: ");
                        Scanner scanner = new Scanner(System.in);
                        float depositAmt = scanner.nextFloat();
                        float bal= account.depositAmt(depositAmt);
                        System.out.println("Amount "+depositAmt+" has been credited "+ "|| Current Balance is "+bal);

                    } else {
                        System.err.print("Account doesn't exist please create an account!!!");
                    }
                    break;
                case 3:
                    if(account != null){
                        System.out.print("enter amount to withdraw: ");
                        Scanner scanner = new Scanner(System.in);
                        float withDrawAmt = scanner.nextFloat();
                        account.withDrawAmt(withDrawAmt);
                    }
                    break;
                case 4:
                    if(account != null){
                        System.out.println("Name: "+account.name+"| "+" Account number: "+account.accNum+"| "+"Current balance: "+account.bal);
                    }
                    break;
                case 5:
                    System.out.println("Application Developed by Shravan Reddy Kandakatla :) !!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Option !!!!");
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
