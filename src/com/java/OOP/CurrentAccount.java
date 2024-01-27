package com.java.OOP;

public class CurrentAccount extends Account{
    public CurrentAccount(long accountNumber, String name, float amount) {
        super(accountNumber, name, amount);
    }

    @Override
    void deposit(float depositAmt) {
        setAmount(getAmount()+ depositAmt);


    }

    @Override
    void withDraw(float withDrawAmt) {
        if(withDrawAmt<getAmount()) {
            setAmount(getAmount()-withDrawAmt);
        }
    }
}
