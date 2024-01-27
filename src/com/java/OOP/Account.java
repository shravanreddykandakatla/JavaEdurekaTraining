package com.java.OOP;

public abstract class Account {
    private long accountNumber;
    private String name;
    private float amount;

    public Account(long accountNumber, String name, float amount) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.amount = amount;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
    abstract void deposit(float depositAmt);
    abstract void withDraw(float withDrawAmt);
}

