package com.java.bankingApplication;

public class Account {
    String name;
    int accNum;
    float bal;

    public Account(String name, int accNum, float bal) {
        this.name = name;
        this.accNum = accNum;
        this.bal = bal;
    }

    public float depositAmt(float depositAmt) {
        this.bal += depositAmt;
        return bal;

    }

    public void withDrawAmt(float withDrawAmt) {
        if(withDrawAmt<bal){
            this.bal-=withDrawAmt;
            System.out.println("Current Balance after withdrawal: "+this.bal);
        }else{
            System.out.println("Insufficient Balance!!!"+" ***Your current balance is: "+ bal);
        }
    }
}
