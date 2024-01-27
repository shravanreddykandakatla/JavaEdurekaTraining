package com.java.OOP;

public class SavingsAccount extends Account{
    double interest;

    public SavingsAccount(long accountNumber, String name, float amount) {
        super(accountNumber, name, amount);

    }

    @Override
    void deposit(float depositAmt) {
        setAmount(getAmount()+ depositAmt);
    }

    @Override
    void withDraw(float withDrawAmt) {
        if(withDrawAmt<getAmount()) {
            setAmount(getAmount() - withDrawAmt);
        }
    }


}
